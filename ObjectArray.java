class ObjectArray{
    ObjectArray(String s){
        System.out.println("Initializing s as "+s);
    }
    public static void main(String[] args) {
        ObjectArray[] array = new ObjectArray[5];
        for(int i=0;i<5;i++)
            array[i]= new ObjectArray("hi");
    }
}