class bol {
    public static void main (String args[]){
        boolean b;

        b = false;
        System.out.println("A variàvel b é: " + b);
        b = true;
        System.out.println("A variàvel b é: " + b);
/* Interessante, como pode vê não fizemos a instruções no IF,
O valor booleano pode controlar a instrução, e por padrão ele sempre puxa o "true",
que seria o primeiro "if" do exemplo, caso queiramos puxar um false, teremos que especificar.
* */
        if(b) System.out.println("Isso é executavel");

        b = false;
        if(b == false) System.out.println("Isso não é executavel");

        System.out.println("10 > 9 é : " + (10 > 9));


    }
}