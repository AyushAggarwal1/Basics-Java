
public class primeNum{
    public static void main(String args[])
    {
        
        // int num = 2;
        // for(int j=1; j<100; j++){

        //     for(int i=1; i< j; i++)
        //     {

        //         if(j%i == 0 )
        //         {
        //             System.out.println("");
    // get c/code/file.txt
    // put d/documnets/

    // rsync root@user1ip:/var/log/text.log root@user2ip:/var/log
        //         }

        //         else{
        //             System.out.println(j);
        //         }
                
        //     }
        //     // System.out.println(j);
        //     // num = num+1;
        int low = 2;
        int high = 100;

        for(int i=low; i<=high; i++)
        {
            if(prm(i))
            {
                System.out.println(i);
            }
        }
    }
    // }

    public static boolean prm(int num)
    {
        if(num <= 1)
        {
            return false;
        }

        for(int i=2 ; i<= Math.sqrt(num); i++)
        {
            if(num%i == 0)
            {
                return false;
            }


        }
        return true;
    }
}
