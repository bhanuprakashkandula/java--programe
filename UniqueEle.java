class UniqueEle
  {
    public int Delete(int arr[])
    {
      int del=arr[5];
      for(int i=0;i<arr.length;i++)
        {
          for(int j=i+1;j<arr.length;j++)
            { 
            if(arr[i]==arr[j])
            {
              for(int k=j;k<arr.length;k++)
                arr[k]=arr[k+1];
              del=arr[i];
            }
          j--;
          arr[i]--;
        }
        }
      return del;
    }
    public static void main(String[]args)
    {
      int a[]={2,5,3,3,7,5};
      UniqueEle obj=new UniqueEle();
      int del=obj.Delete(a);
       System.out.println(del);
    }
  }
/*for(i=0;i<number;i++){
   for(j = i+1; j < number; j++){
      if(a[i] == a[j]){
         for(k = j; k <number; k++){
            a[k] = a[k+1];
         }
         j--;
         number--;
      }
   }
}*/