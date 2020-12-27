
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

