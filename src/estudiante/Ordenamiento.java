/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudiante;

public class Ordenamiento {
    public static void main(String[] args) {
        Estudiante[]arrayEstudiante = new Estudiante[5];
        arrayEstudiante[0] = new Estudiante("nicolas","bedoya","1082216666",5,5.0);
        arrayEstudiante[1] = new Estudiante("nathalia","gamboa","116666",4,4.5);
        arrayEstudiante[2] = new Estudiante("pepito","perez","1066",3,4.8);
        arrayEstudiante[3] = new Estudiante("juan","lopez","216666",2,4.2);
        arrayEstudiante[4] = new Estudiante("lupe","andrade","10456",1,2.0);
        arrayEstudiante[5] = new Estudiante("felix","loé","1082287",6,3.5);
        
        int temp;
        
        for(int i=1;i < arrayEstudiante.length;i++){
            for (int j=0 ; j < arrayEstudiante.length- 1; j++){
                if (arrayEstudiante[j].getNota() < arrayEstudiante[j+1].getNota()){
                    temp = arrayEstudiante[j].getPuesto();
                    arrayEstudiante[j].setPuesto(arrayEstudiante[j+1].getPuesto());
                    arrayEstudiante[j+1].setPuesto(temp);
                }
            }
        }
            for(int i=0;i < arrayEstudiante.length;i++){
                
                
                System.out.println(arrayEstudiante[i]);
                    
                
            }
    }
    
}
