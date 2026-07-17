class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        prefix = {}
        for index,element in enumerate(nums):
            if prefix.get(target-element) != None:
                return [prefix.get(target-element), index]
            prefix[element] = index
        return [-1,-1]
        