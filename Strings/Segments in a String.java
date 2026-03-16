public class Solution {
    public int CountSegments(string s) {
         return s.Split(new char[] { ' ' }, StringSplitOptions.RemoveEmptyEntries).Length;
    }
}