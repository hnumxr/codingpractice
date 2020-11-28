public class UnitTestCases
{
    /*
            BalancedBrackets b = new BalancedBrackets();
        System.out.println(b.isBalanced("{[()]}"));

     */
    /*
            ArraysLeftRotation a = new ArraysLeftRotation();
        int[] al = new int[]{1,2,3,4,5};
        int r = 4;
        System.out.println(Arrays.toString(a.rotLeft(al, r)));
     */

    /*
            DesignerPDFViewer d = new DesignerPDFViewer();
        int[] h = new int[]{1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5};
        String w = "abc";
        int[] h2 = new int[]{1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 7};
        String w2 = "zaba";
        System.out.println(d.designerPdfViewer(h2, w2));
     */

    /*
        AVeryBigSum a = new AVeryBigSum();
        long[] b = new long[]{1000000001, 1000000002, 1000000003, 1000000004, 1000000005};
        System.out.println(a.aVeryBigSum(b));
     */

    /*
        HashSet<Integer> root = new HashSet<Integer>();
        root.add(1);
        root.add(2);
        root.add(3);

        HashSet<Integer> a = new HashSet<Integer>();
        a = (HashSet<Integer>) root.clone();
        a.add(4);
        HashSet<Integer> b = new HashSet<Integer>();
        b = (HashSet<Integer>) root.clone();
        b.add(5);

        System.out.println("root：" + root.toString());
        System.out.println("a：" + a.toString());
        System.out.println("b：" + b.toString());
        Iterator<Integer> i = root.iterator();
        while (i.hasNext()){
            System.out.println("root 1: " + i.next());
        }

        TreeNode t = new TreeNode(2);
        t.left = new TreeNode(1);
        t.right = new TreeNode(3);

        LeetCodeValidateBinarySearchTree l = new LeetCodeValidateBinarySearchTree();
        System.out.println(l.isValidBST(t));
        LeetCodeValidateBinarySearchTreeSolution2 l2 = new LeetCodeValidateBinarySearchTreeSolution2();
        System.out.println(l2.isValidBST(t));
     */

    /*ArrayList<Integer> a =  new ArrayList<Integer>();
        a.add(0, 2);
        a.add(1, 2);
        a.add(2, 3);
        PlusOne p = new PlusOne();
        Object[] b = p.plusOne(a).toArray();
        System.out.println(Arrays.toString(b));

        String sampleString = "11";
        ValidPar v = new ValidPar();
        System.out.println(v.ValidPalindrome(sampleString));

         */
//    f();
/*
        LeetCode53MaximumSubarray s = new LeetCode53MaximumSubarray();
        int[] inputList = new int[]{-2,1,-3,4,0,-1,2,1,-5,8,-3,5};//{-1,-1,-2,-2};//{-1,0,-2};//
        System.out.println(s.maxSubArrayBase(inputList));
        System.out.println(s.maxSubArray(inputList));
        System.out.println(s.learn1(inputList));
        System.out.println(s.changefromlearn1(inputList));


        LeetCodeBestTimetoBuyandSellStockII l = new LeetCodeBestTimetoBuyandSellStockII();
        int[] inputlist2 = new int[]{8,6,4,3,3,2,3,5,8,3,8,2,6};
        System.out.println(l.maxProfit(inputlist2));
        System.out.println(l.maxProfit2(inputlist2));
        System.out.println(l.maxProfit3(inputlist2));
*/

    //LeetCodeRotateArray l2 = new LeetCodeRotateArray();
    //int[] inputlist3 = new int[]{1,2,3,4,5,6,7};
    //l2.rotateadvanced(inputlist3, 3);
    //l2.rotate(inputlist3, 3);
    //System.out.println(inputlist3.toString());

    //LeetCodeContainsDuplicate l3 = new LeetCodeContainsDuplicate();
    //l3.containsDuplicate(new int[]{3,2,4,5,1,3});
/*
    LeetCodeSingleNumber s = new LeetCodeSingleNumber();
    int[] inputlist = new int[]{1,2,1,2,0,0};
        System.out.println(s.singleNumber(inputlist));
        System.out.println(s.singleNumberApproch2(inputlist));

        int[] num1 = new int[]{4,7,9,7,6,7};
        int[] num2 = new int[]{5,0,0,6,1,6,2,2,4};
        LeetCodeIntersectionofTwoArraysII l = new LeetCodeIntersectionofTwoArraysII();
        System.out.println(l.intersect(num1,num2));

                LeetCodeMoveZeroes l = new LeetCodeMoveZeroes();
        int[] i = new int[]{0,0,1,0,2};
        //l.moveZeroesbase(i);
        //l.moveZerosAdvanced(i);
        l.moveZerosAdvanced2(i);
        UnitTestCases u = new UnitTestCases();
        int a = 1, b = 2;
        u.swap(a, b);
        System.out.println("a = "+ a + "; b = " + b);

        Integer c = new Integer(3), d = new Integer(4);
        System.out.println("c = " + c + "; d = " + d);
        u.swap(c, d);
        System.out.println("c = " + c + "; d = " + d);

        int[] ar = new int[]{a,b};
        System.out.println(Arrays.toString(ar));
        u.swap(ar, 0, 1);
        System.out.println(Arrays.toString(ar));

                LeetCodeTwoSum l = new LeetCodeTwoSum();
        int[] a = new int[]{-1,-2,-3,-4,-5};
        int target = -8;
        //System.out.println(Arrays.toString(l.twoSumBase(a, target)));
        //System.out.println(Arrays.toString(l.twoSumAdvanced(a, target)));
        System.out.println(Arrays.toString(l.twoSumAdvanced2(a, target)));

                char[][] c = new char[][]{
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        LeetCodeValidSudoku l2 = new LeetCodeValidSudoku();
        System.out.println(l2.isValidSudoku(c));

                int[][] m = new int[][]{
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        LeetCodeRotateImage l = new LeetCodeRotateImage();
        l.rotate(m);

                LeetCodeReverseString l = new LeetCodeReverseString();
        char[] c = new char[]{'h','e','l','l','o'};
        l.reverseString(c);
        System.out.println(c);

                int a = 123;
        LeetCodeReverseInteger l = new LeetCodeReverseInteger();
        System.out.println(l.reverse(a));
        System.out.println(l.reverseAdvanced(a));
        System.out.println(l.reverseAdvanced2(a));

                String a = "eleetcode";
        LeetCodeFirstUniqueCharacterinaString l = new LeetCodeFirstUniqueCharacterinaString();
        System.out.println(l.firstUniqChar(a));
        System.out.println(l.firstUniqCharBase2(a));

                String s = "anagram", t = "nagaram";
        LeetCodeValidAnagram l = new LeetCodeValidAnagram();
        System.out.println(l.isAnagram(s, t));

                String a = "0P";
        LeetCodeValidPalindrome l = new LeetCodeValidPalindrome();
        System.out.println(l.isPalindrome(a));

                System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        String a = "-91283472332";
        LeetCodeStringtoInteger l = new LeetCodeStringtoInteger();
        System.out.println(l.myAtoi(a));

                LeetCodeImplementstrStr l = new LeetCodeImplementstrStr();
        System.out.println(l.strStr("abcllaaa", "ll"));

                LeetCodeCountandSay l = new LeetCodeCountandSay();
        System.out.println(l.countAndSay(1));
        System.out.println(l.countAndSay(2));
        System.out.println(l.countAndSay(3));
        System.out.println(l.countAndSay(4));
        System.out.println(l.countAndSay(5));
        System.out.println(l.countAndSay(6));
        System.out.println(l.countAndSay(7));
        System.out.println(l.countAndSay(8));
        System.out.println(l.countAndSay(9));
        System.out.println(l.countAndSay(10));
        //System.out.println(l.countAndSay(100));

                LeetCodeLongestCommonPrefix l = new LeetCodeLongestCommonPrefix();
        String[] s = new String[]{"flower","flow","flight"};
        String[] s2 = new String[]{"dog","racecar","car"};
        String[] s3 = new String[]{"","b"};
        String[] s4 = new String[]{"leets", "leetcode", "leetc", "leeds"};
        System.out.println(l.longestCommonPrefix(s));
        System.out.println(l.longestCommonPrefix(s2));
        System.out.println(l.longestCommonPrefix(s3));
        System.out.println(l.longestCommonPrefixBinaryTree(s4));
*/
    public static void f() {
        String[] a = new String[2];
        Object[] b = new Integer[1];
        a[0] = "hi";
        b[0] = Integer.valueOf(42);
    }

    public void swap(int i, int j){
        int temp = i;
        i = j;
        j = temp;
    }

    public void swap(Integer i, Integer j){
        Integer temp = i;
        i = j;
        j = temp;
    }

    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

abstract class Vehicle{
    int maxSpeed = 120;

    static void message(){
        System.out.println("This is Vehicle class");
    }

    void display(){
        System.out.println("Max speed: " + maxSpeed);
    }
}

abstract class ArtDesign{}

interface ILambPaper{
    int a=0;
}

class Car extends Vehicle
{
    int maxSpeed = 180;

    //@Override
    static void message(){
        System.out.println("This is Car class");
    }

    int display(int a){
        System.out.println("Max speed: " + maxSpeed);
        System.out.println("My parent's Max speed: " + super.maxSpeed);
        return 1;
    }
}