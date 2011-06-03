package nisbet.duncan.pool.snippets;

class Triangle{
    double area;
    int height;
    int length;
    
    void setArea() {
        area = (height * length) / 2;
    }
    
    public static void main (String [] args){
        int arrayIndex = 0; 

        // Declare and create array
        Triangle[] triangleArray = new Triangle[4];        
        while (arrayIndex < 4){
        
            // Create triangle and put in the array
            triangleArray[arrayIndex] = new Triangle();
            
            // Accessing the triangles in the array
            triangleArray[arrayIndex].height = (arrayIndex + 1) * 2;
            triangleArray[arrayIndex].length = arrayIndex + 4;
            triangleArray[arrayIndex].setArea();

            System.out.print("triangle "+arrayIndex+", area");
            System.out.println(" = " + triangleArray[arrayIndex].area);
            arrayIndex = arrayIndex + 1;		
        }
        int y = arrayIndex;
        arrayIndex =27;
        Triangle t5 = triangleArray[2];
        triangleArray[2].area = 343;
        System.out.print("y = " + y);
        System.out.println(", t5 area = "+ t5.area);
    }
}