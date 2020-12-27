public class Solution {
    public static void main(String[] args){
        Student sol=new Student();
        Class student = sol.getClass();
        Method[] methods =student.getDeclaredMethods();

        ArrayList<String> methodList = new ArrayList<String>();
        for(Method meth:methods){
            methodList.add(meth.getName());
        }
        Collections.sort(methodList);
        for(String name: methodList){
            System.out.println(name);
        }
    }

}