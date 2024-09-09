public class Main {
    public static void main(String[] args) {
        int a=13;
        int b=4;
        System.out.println(a+b);//17
        System.out.println(a-b);//9
        System.out.println(a*b);//52
        System.out.println(a==b);//false
        System.out.println(a!=b);//true
        System.out.println(a>b);//true
        System.out.println(a<b);//false
        System.out.println(a>=b);//true
        System.out.println(a<=b);//false
        // 이 이후 부터는 정수형 비트 연산
        System.out.println(a&b);//AND 연산
        System.out.println(a|b);//or 연산
        System.out.println(a^b);//XOR 9 1과1이 만나면 0 0과 0이 만나면 1
        System.out.println(~a);//Not/-14
        System.out.println(a<<2);//왼쪽 시프트 a에 2^2 곱한거랑 같음
        System.out.println(a>>1);//오른쪽 시프트 a를 2^1로 나눈거랑 같음

        //부동소수점 연산
        System.out.println(2.5+3.7);//6.2
        System.out.println(7.9-4.2);//3.7
        System.out.println(1.5*4.8);//곱하기 7.19999999999
        System.out.println(10.0/3.2);//나누기 3.125
        System.out.println(10.0%3.2);//모듈러 연산 0.39999999947

        //부동소수형 논리 연산
        double x=0.5;
        double y=1.2;
        double z=2.0;
        System.out.println(x>y && y<z);//AND 연산 /false
        System.out.println(x<y || y<z);//OR 연산 true
        System.out.println(!(x>y));//true

    }
}