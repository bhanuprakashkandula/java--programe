class SecoLarge
  {
    public int FindSeco(int a[])
    {
      int max=a[0];
      int smax=a[0];
      for(int i=1;i<a.length;i++)
        {
          if(max<a[i])
          {
            smax=max;
            max=a[i];
          }
          else if(smax<a[i])
          {
            smax=a[i];
          }
        }
    return smax;
    }
    public static void main(String[]args)
    {
     int arr[]={56,36,25,14,85,96,75,21,};
      SecoLarge obj=new SecoLarge();
      int smax=obj.FindSeco(arr);
      
        System.out.println("THe second largest element is:"+smax);
    }
}