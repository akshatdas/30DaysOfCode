public class Solution {
  public TreeNode minimalTreeHelper(int[] sortedVals) {
    return minimalTree(sortedVals, sortedVals[0], sortedVals[sortedVals.length - 1]);
  }

  public TreeNode minimalTree(int[] vals, int start, int end) {
    if (end < start) {
      return null;
    }
    int midVal = (end - start) / 2;
    TreeNode node = new TreeNode(vals[midVal]);
    node.left = minimalTree(vals, start, midVal - 1);
    node.right = minimalTree(vals, midVal + 1, end);
  }
}
