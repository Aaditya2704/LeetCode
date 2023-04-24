Approach + Intuition: In our code, we start by declaring a few variables:
​
num1 and num2 will store our current most frequent and second most frequent elements.
c1 and c2 will store their frequency relative to other numbers.
We are sure that there will be a max of 2 elements that occurs > N/3 times because there cannot be if you do a simple math addition.
​
Let, ele be the element present in the array at any index.
​
if ele == num1, so we increment c1.
if ele == num2, so we increment c2.
if c1 is 0, so we assign num1 = ele.
if c2 is 0, so we assign num2 = ele.
In all the other cases we decrease both c1 and c2.
​
In the last step, we will run a loop to check if num1 or nums2 are the majority elements or not by running a for loop check.
​
Intuition: Since it’s guaranteed that a number can be a majority element, hence it will always be present at the last block, hence, in turn, will be on nums1 and nums2. For a more detailed explanation, please watch the video below.