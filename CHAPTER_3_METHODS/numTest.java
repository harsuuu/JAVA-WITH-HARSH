class numTest
{
    int num1;
    int num2;
    numTest(int m, int n)
    {
        num1=m;
        num2=n;
    }
    void prime()
    {
        int i,j;
        for(i=num1;i<=num2;i++)
        {
            for(j=2;j<i;j++)  //hme check krna hai 2 se lekr us number tk agr kisi se divide kha gya mtlb bo prime nhi hai. 1 se start nhi krenge qki 1 se to sb divide ho hi jate hai.
            {
                if(i%j==0)
                {
                    break;  //means prime number nhi hai.
                }
            }
            if(j==i)
            {
                System.out.println(j);
            }
        }
    }
    public static void main(String[] args) {
    numTest n = new numTest(2, 9);
    n.prime();
    }
}
