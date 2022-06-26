public class prueba2{
    public static void main (String[] args) {

        /* code */
        celulares celular1=new celulares ( "Samsung",  "A 20","32 Gb",  "3 Gb", "Exynos 7884 GPU Mali-G71",  3,  "4000 mAh", "negro", "6.4 pulgadas" );
        System.out.println(celular1.toString());
        celulares celular2=new celulares ( "Xiaomi",  "Redmi Note 9",  "120 Gb",  "4 Gb", "Mediatec Helio G85 Octa-Core2.0",  5,  "5020 mAh", "verde",  "6.53 pulgadas" );
        System.out.println(celular2.toString());
        celulares celular3=new celulares ("Huawei",  "P 20 Lite",  "32 Gb",  "4 Gb",  "Kirin 659",  2,  "3000 mAh", "blanco",  "5.84 pulgadas" );
        System.out.println(celular3.toString());

    }
}
