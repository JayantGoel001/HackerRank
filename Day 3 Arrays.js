

/**
*   Return the second largest number in the array.
*   @param {Number[]} nums - An array of numbers.
*   @return {Number} The second largest number in the array.
**/
function getSecondLargest(nums) {
    // Complete the function
    var max = -9999;
    for (var i = 0; i < nums.length;i++)
    {
        if (nums[i] > max)
        {
            max = nums[i];
        }
    }
    var max2 = -9999;
    for (var i = 0; i < nums.length; i++)
    {
        if (nums[i] > max2 && nums[i] != max)
        {
            max2 = nums[i];
        }
    }
     return (max2);
}

