/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

// 278. First Bad Version
// 다른 사람 코드 참고함

//public class leetcode_230122 extends VersionControl {
//    public int firstBadVersion(int n) {
//        int l=1;
//        while(l<=n){
//            int m=l+(n-l)/2;
//            if(isBadVersion(m)){
//                n=m-1;
//            }else{
//                l=m+1;
//            }
//        }
//        return l;
//    }
//}
