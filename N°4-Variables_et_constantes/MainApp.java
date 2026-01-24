public class MainApp
{
    public static void main(String[] args)
    {
        int ageUtilisateur = 22;

        final int CONSTANTE = 3;    //par convention mettre les constantes en MAJ --> BLA_BLA_BLA

        final float PI_float = 3.14f;   //rajout du f à la fin pour float sinon double ...

        final double PI_double = 3.14;

        System.out.printf("Age = %d , Constante = %d , PI_float = %.3f , PI_double = %.3f%n",ageUtilisateur,CONSTANTE,PI_float,PI_double);
    }
}