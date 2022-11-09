class MinElement
  {
    public int Findmin(int a[])
    {
      int min=a[0];
        for(int i=1;i<a.length;i++)
          {
            if(min>a[i])
            {
              min=a[i];
            }
          }
       return min;
    }
     public static void main(String[]args)
   {
     int arr[]={20,87,90,75,97,88};
     MinElement obj=new MinElement();
     int min=obj.Findmin(arr);
     System.out.println("min valueis:"+min);
   }
   
  }
