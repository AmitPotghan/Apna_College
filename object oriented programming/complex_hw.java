public class complex_hw {
    public static void main(String[] args) {
        complex c1=new complex(1, 2);
        complex c2=new complex(5,3);
        System.out.print("The addition of complex numbers is:");
        complex c3=complex.add(c1,c2);
        c3.print();

        System.out.print("The Substraction of complex numbers is:");
        complex c4=complex.sub(c1,c2);
        c4.print();

        System.out.print("The Multiplication of complex numbers is:");
        complex c5=complex.multiply(c1,c2);
        c5.print();
    }
}
class complex{
    int real;
    int imag;
    public complex(int r,int i){
        real=r;
        imag=i;
    }
    public static complex add(complex a,complex b){
        return new complex(a.real+b.real,a.imag+b.imag);
    }
    
    public static complex sub(complex a,complex b){
        return new complex(a.real-b.real,a.imag-b.imag);
    }
    public static complex multiply(complex a ,complex b){
        return new complex(((a.real * b.real) - (a.imag*b.imag)),(a.real*b.imag + a.imag*b.real));
    }
    public void print(){
        if (real==0 && imag!=0){
            System.out.println(imag+"i");
        }else if(real!=0 && imag==0){
            System.out.println("real");
        }else{
            System.out.println(real+"+"+imag+"i");
        }
        
    }
}
