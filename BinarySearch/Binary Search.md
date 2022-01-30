# 二分查找

## Basic：闭区间二分查找-终点随机

```cpp
int left = 0
int right = nums.size()-1;
while(left<=right){
	int mid = left + (right - left) / 2;
	if(nums[mid]==target){
	    return mid;
	} else if(nums[mid]<target){
	    left = mid+1;
	} else if(nums[mid]>target){
	    right = mid-1;
	}
}
return -1;
```

搜索区间为 `[left,right]` ，结束条件为 `left = right+1` 。 *right的初始化与while的退出条件相关*

**缺点**在于当出现重复元素时，无法定位到最左边或最右边

## 左侧边界二分查找

### 开区间

```cpp
int leftMost(const vector<int>& nums, int target){
    int left = 0;
    int right = nums.size();
    while(left<right){
        int mid = left+(right-left)/2;
        if(nums[mid]==target){
            right = mid;
        } else if(nums[mid]<target){
            left = mid+1;
        } else if(nums[mid]>target){
            right = mid;
        }
    }
    if(left == nums.size())
        return -1;
    return nums[left]==target? left:-1;
}
```

### 闭区间

```cpp
int leftMost(const vector<int>& nums, int target){
    int left = 0;
    int right = nums.size()-1;
    while(left<=right){
        int mid = left+(right-left)/2;
        if(nums[mid]==target){
            right = mid-1;
        } else if(nums[mid]<target){
            left = mid+1;
        } else if(nums[mid]>target){
            right = mid-1;
        }
    }
    if(left==nums.size())
        return -1;
    return nums[left]==target?left:-1;
}
```

## 右侧边界二分查找

### 开区间

```cpp
int rightMost(const vector<int>& nums, int target){
    int left = 0;
    int right = nums.size();
    while(left<right){
        int mid = left+(right-left)/2;
        if(nums[mid] == target){
            left = mid+1;
        } else if (nums[mid]>target){
            right = mid;
        } else if(nums[mid]<target){
            left = mid+1;
        }
    }
    if(right == 0) 
        return -1;
    return nums[right-1]==target?right-1:-1;
}
```

### 闭区间

```cpp
int rightMost(const vector<int>& nums, int target){
    int left = 0;
    int right = nums.size()-1;
    while(left<=right){
        int mid = left+(right-left)/2;
        if(nums[mid] == target){
            left = mid+1;
        } else if (nums[mid]>target){
            right = mid-1;
        } else if(nums[mid]<target){
            left = mid+1;
        }
    }
    if(right == -1) 
        return -1;
    return nums[right]==target?right:-1;
}
```