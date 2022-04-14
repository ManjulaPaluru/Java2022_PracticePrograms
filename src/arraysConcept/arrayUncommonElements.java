package arraysConcept;

public class arrayUncommonElements {

    public static void main(String args[]) {
        int arr1[]= {1, 3, 8,  9, 17, 18};
        int arr2[]= {1, 8, 5, 12, 18, 19, 100, 120};

        printUncommonElements(arr1, arr2);
    }


            static void printUncommonElements(int arr1[], int arr2[]) {
                int i = 0, j = 0;
                int len1 = arr1.length, len2 = arr2.length;

                while(i < len1 && j < len2) {
                    if(arr1[i] < arr2[j])
                        System.out.println(arr1[i++]);
                    else if (arr1[i] > arr2[j])
                        System.out.println(arr2[j++]);
                    else {
                        i++;
                        j++;
                    }
                }
                while(i < len1 && arr1[i] != arr2[j])
                    System.out.println(arr1[i++]);
                i--;
                while(j < len2 && arr2[j] != arr1[i])
                    System.out.println(arr2[j++]);
            }

}



