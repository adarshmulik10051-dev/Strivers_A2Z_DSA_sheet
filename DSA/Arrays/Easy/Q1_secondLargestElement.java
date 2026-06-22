package DSA.Arrays.Easy;
public class Q1_secondLargestElement{
    public static void secLargest(int arr[],int n){
        // approach:o(n)
        //1.asuume arr is non-negativ , larg=0,sec=-1
        //2.traverse array cheak arr[i]>largest? yes -->fiest update seclarg then largest 
        //3.cheak first cdn is false see arr[i]>secl & sec!=largest 
        int largest = arr[0];
        int secLargest =-1;

        for(int i = 0 ; i < n ; i++){
            if(arr[i]>largest){
                secLargest=largest;
                largest=arr[i];
            }
           else if(arr[i]>secLargest&&secLargest!=largest){
                secLargest=arr[i];
            }
        }
        System.out.println("Second largest is :"+secLargest);
    }
    public static void main (String args[]){
        int arr []= {1,2,4,8,5};
        int n = arr.length;
        secLargest(arr, n);
    }
    
} 