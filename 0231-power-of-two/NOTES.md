## Approach 1 (Iterative method):

- Run a loop from 0 to 30 (Integer.MAX_VALUE =2^31)​ 
- Keep calculating and storing the pow(2,i) in a value
- Keep comparing the given number and the above stored number -- return ture if it matches

 ```java
 public boolean isPowerOfTwo(int n) {
        for (int i = 0; i <= 30; i++) {
            int res = (int) Math.pow(2, i); // Cast to int
            if (res == n) {
                return true;
            }
        }
        return false;
    }
```

## Approach 2 (Bit Manipulative):

- Power of 2 in when converted into bit has only bit 1, rest all are zero. 
- Suppose n is a power of 2. Then if you commpare n & (n-1) using '&', it will give true.

```java
 if(n>0 && (n & (n-1)) == 0)
        {
            return true;
        }
        
        return false;
```
