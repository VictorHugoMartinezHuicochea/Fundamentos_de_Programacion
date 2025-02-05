/*
*Dias de la semana. Considere que se cuenta con un calendario que tiene 14 meses, los meses 1,
*3, 4, 5, 8, 10 y 13 tienen 32 dias, los meses 2, 7, 9, 12 y 14 tiene 29 dias, el mes 6 desde el anio cero tiene 31
*dias cada 5 anios y el resto tiene 30 dias, el mes 11 desde el anio cero tiene 30 dias cada 7 anios y el resto tiene
*31 dias. Las semanas constan de 11 dias y sus nombres son Adi, Bedi, Cedi, Dedi, Edi, Fedi, Guedi, Hedi, Idi,
*Jedi y Kedi. Desarrolle un programa que dado una fecha como dia de la semana, dia del mes, mes y anio, una
*segunda fecha como dia del mes, mes y anio, el programa debe indicar en la salida estandar en que dia de la
*semana cae la segunda fecha.
*/

    
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int totaldias(int,int,int,int);
int diaes(char[]);
int buscaerror(int,int,int,int);

struct AMS{
    int anio;
    int mes;
    int sep;
};


int main(int argc, char *argv[])
{
  char dia[5];
    struct AMS A,B;
    int fecha, dian, error, td1, fecha2, td2, falt;
    
    
    printf("Por favor digite la primera fecha: \n\n");
    printf("\t Dia de la semana (Primera letra en mayusculas porfavor):  "); scanf("%s", &dia);
    printf("\n\t Fecha en formato aaaammdd (Evitar empezar con 0): "); scanf("%i", &fecha);
    printf("\n\t Digite su segunda fecha en formato aaaammdd (Evitar empezar con 0): "); scanf("%i", &fecha2);
    
    A.sep=fecha;
    B.sep=fecha2;
    
    dian=diaes(dia);
    
    //Analisis primera fecha
    A.anio=A.sep/10000;
    A.sep-=(A.anio*10000);
    A.mes=A.sep/100;
    A.sep-=(A.mes*100);

    
    //Analisis segunda fecha
    B.anio=B.sep/10000;
    B.sep-=(B.anio*10000);
    B.mes=B.sep/100;
    B.sep-=(B.mes*100);

   
    error=buscaerror(dian,A.anio,A.mes,A.sep);
    if(error!=0) error=buscaerror(dian,B.anio,B.mes,B.sep);
    
    td1=totaldias(fecha, A.anio, A.mes, A.sep);
    td2=totaldias(fecha2,B.anio, B.mes, B.sep);
    
    falt=td2-td1;
    if(falt<=0) error=0;
    falt+=dian;
    falt%=11;
    
    if(error==0)
    {
        printf("\nPor favor digite un valor aceptado");
    }
    else{
        printf("\n El dia de la semana en el que caera la nueva fecha sera: ");
        switch(falt)
        {
            case 0: printf("Adi"); break;
            case 1: printf("Bedi"); break;
            case 2: printf("Cedi"); break;
            case 3: printf("Dedi"); break;
            case 4: printf("Edi"); break;
            case 5: printf("Fedi"); break;
            case 6: printf("Gedi"); break;
            case 7: printf("Hedi"); break;
            case 8: printf("Idi"); break;
            case 9: printf("Jedi"); break;
            case 10: printf("Kedi"); break;
        }
}
    
    
    printf("\nFin del programa :)\n");
    system("pause");
    return 0;

}


//numeraremos los dias para su posterior manejo
int diaes (char est[])
{
        int sup;
        char a[]="Adi", b[]="Bedi", c[]="Cedi", d[]="Dedi", e[]="Edi", f[]="Fedi", g[]="Gedi", h[]="Hedi", i[]="Idi", j[]="Jedi", k[]="Kedi";
        if((strcmp(est,a)<0) || (strcmp(est,k)>0))
        {
            printf("Ingrese algo valido");
            sup=11;
        }
        else
        {    
        if (strcmp(est,a)==0) sup=0;
        if (strcmp(est,b)==0) sup=1;
        if (strcmp(est,c)==0) sup=2;
        if (strcmp(est,d)==0) sup=3;
        if (strcmp(est,e)==0) sup=4;
        if (strcmp(est,f)==0) sup=5;
        if (strcmp(est,g)==0) sup=6;
        if (strcmp(est,h)==0) sup=7;
        if (strcmp(est,i)==0) sup=8;
        if (strcmp(est,j)==0) sup=9;
        if (strcmp(est,k)==0) sup=10;
        }
        return sup;
}




//intentaremos evitar los mayores errores posibles
int buscaerror(int w, int x, int y, int z)
{
    int e, a6,a11;
    e=1;
    if(w==11) e=0;
    if(x<0) e=0;
    if(z==0) e=0;
    
    //Evitaremos las exepciones de los meses 6 y 11
    if (x!=0)
    {
        a6=(x%5)+1;
        a11=(x%7)+1;
    } 
    else
    {
        a6=5;
        a11=7;
    }
    
    
    //Y es el mes, por lo que ahora quitaremos los errores de excesos de dias
    switch (y)
    {
        case 1: if(z>32) e=0; break;
        case 2: if(z>29) e=0; break;
        case 3: if(z>32) e=0; break;
        case 4: if(z>32) e=0; break;
        case 5: if(z>32) e=0; break;
        case 6: if (a6!=5 && z>30) e=0; if(a6==5 && z>31)  e=0; break;
        case 7: if(z>29) e=0; break;
        case 8: if(z>32) e=0; break;
        case 9: if(z>29) e=0; break;
        case 10: if(z>32) e=0; break;
        case 11: if(a11!=7 && z>31) e=0; if(a11==7 && z>30)  e=0; break;
        case 12: if(z>29) e=0; break;
        case 13: if(z>32) e=0; break;
        case 14: if(z>29) e=0; break;
        default: e=0;
    }
    
    
    return e;
}


int totaldias (int p,int q, int r, int s)
{
    int contador, bis6,bis11, i, na, a6,a11;
    bis11=q/7;
    bis6=q/5;
    contador=((q-1)*(5*29))+((q-1)*(32*7))+(30*(q-1))+(31*(q-1))+bis6+bis11;
    
    
    if (q!=0)
    {
        a6=(q%5)+1;
        a11=(q%7)+1;
    } 
    else
    {
        a6=5;
        a11=7;
    }
    
    switch(r)
    {
        case 2: contador+=32; break;
        case 3: contador+=61; break;
        case 4: contador+=93; break;
        case 5: contador+=132; break;
        case 6: contador+=157; break;
        case 7: if (a6!=5) contador+=187; if(a6==5)  contador+=188; break;
        case 8: if (a6!=5) contador+=216; if(a6==5)  contador+=217; break;
        case 9: if (a6!=5) contador+=248; if(a6==5)  contador+=249; break;
        case 10: if (a6!=5) contador+=277; if(a6==5)  contador+=277; break;
        case 11: if (a6!=5) contador+=309; if(a6==5)  contador+=310; break;
        case 12: if (a6!=5 && a11!=7) contador+=340; if(a6==5 && a11!=7)  contador+=341; 
                if (a6!=5 && a11==7) contador+=339; if(a6==5 && a11==7)  contador+=340; break;
        case 13:  if (a6!=5 && a11!=7) contador+=369; if(a6==5 && a11!=7)  contador+=370; 
                if (a6!=5 && a11==7) contador+=368; if(a6==5 && a11==7)  contador+=369; break;
        case 14:  if (a6!=5 && a11!=7) contador+=401; if(a6==5 && a11!=7)  contador+=402; 
                if (a6!=5 && a11==7) contador+=400; if(a6==5 && a11==7)  contador+=401; break;
            
    }
    contador+=s;
    return contador;
    }
