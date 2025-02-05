
package ArbolMerkle;

/**
 *
 * @author Victor Hugo
 */

//codificaremos el codigo donde cada elemento tiene un numero
public class MT_Codificador {
    public static String Codigin (String F1) {
        int i=0;
        
        
        char Fra1[]=F1.toCharArray();
        int Conv[];
        Conv=new int[F1.length()];
        while(i<F1.length())
            {   
                
                switch(Fra1[i])
                {
                    case'0':
                        Conv[i]=0;
                        break;
                    case 'A': 
                    case'a':
                    case'1':
                        Conv[i]=1;
                        break;
                    case 'B': 
                    case'b':
                    case'2':
                        Conv[i]=2;
                        break;
                    case 'C': 
                    case'c':
                    case'3':
                        Conv[i]=3;
                        break;
                    case 'D': 
                    case'd':
                    case'4':
                        Conv[i]=4;
                        break;
                    case 'E': 
                    case'e':
                    case'5':
                        Conv[i]=5;
                        break;
                    case 'F': 
                    case'f':
                    case'6':
                        Conv[i]=6;
                        break;
                    case 'G': 
                    case'g':
                    case'7':
                        Conv[i]=7;
                        break;
                    case 'H': 
                    case'h':
                    case'8':
                        Conv[i]=8;
                        break;   
                    case 'I': 
                    case'i':
                    case'9':
                        Conv[i]=9;
                        break;
                    case 'J': 
                    case'j':
                    case' ':
                        Conv[i]=10;
                        break;
                    case 'K': 
                    case'k':
                    case'$':
                        Conv[i]=11;
                        break;
                    case 'L': 
                    case'l':
                    case'.':
                        Conv[i]=12;
                        break;
                    case 'M': 
                    case'm':
                        Conv[i]=13;
                        break;
                    case 'N': 
                    case'n':
                        Conv[i]=14;
                        break;
                    case 'O': 
                    case'o':
                        Conv[i]=15;
                        break;    
                    case 'P': 
                    case'p':
                        Conv[i]=16;
                        break;    
                    case 'Q': 
                    case'q':
                        Conv[i]=17;
                        break;
                    case 'R': 
                    case'r':
                        Conv[i]=18;
                        break;    
                    case 'S': 
                    case's':
                        Conv[i]=19;
                        break;    
                    case 'T': 
                    case't':
                        Conv[i]=20;
                        break;    
                    case 'U': 
                    case'u':
                        Conv[i]=21;
                        break;
                    case 'V': 
                    case'v':
                        Conv[i]=22;
                        break;    
                    case 'W': 
                    case'w':
                        Conv[i]=23;
                        break;    
                    case 'X': 
                    case'x':
                        Conv[i]=24;
                        break;
                    case 'Y': 
                    case'y':
                        Conv[i]=25;
                        break;    
                    case 'Z': 
                    case'z':
                        Conv[i]=26;
                        break;    
                    default:
                        Conv[i]=27;
                }
                
                
                i++;
                
            }
        
        
        //convertimos de nuevo a String
        StringBuffer sb = new StringBuffer();
                for(i=0;i<F1.length();i++){
		   sb.append(Conv[i]);
		}   
         
        String Cod;
        Cod=sb.toString();
        
        
        
        //retornamos
        return new String(Cod);
    }
}
