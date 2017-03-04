# File Input and Output
### by Pappim Pipatkasrira

The result of this program running on my laptop:

|Task                                             |Time         |
|:------------------------------------------------|------------:|
|Copy a file byte-by-byte                         |4.892508 sec |
|Copy a file using byte of size 1KB               |0.007198 sec |
|Copy a file using byte of size 4KB               |0.003690 sec |
|Copy a file using byte of size 64KB              |0.001555 sec |
|Copy a file using BufferedRender and PrintWriter |0.062959 sec |

## Explanation of Results

Copying file byte-by-byte is the slowest because it copies 1 byte at a time.

Copy a file using byte of size 1KB is faster than byte-by-byte because
byte-by-byte copies 1B at the time
but copy a file using byte of size 1KB copies 1KB (1024B) at the same time.

The more byte you set, the more files you get at the time.

Copy a file using BufferedRender and PrintWriter copies 1 line at a time.
1 line is approximately 5 letters x 14 words x 2 bytes = 140 bytes = 0.14 kilobytes.
So copy a file using BufferedRender copies approximately 0.14 kilobytes at a time.
So it is faster than byte-by-byte but slower than 1KB, 4KB and 64 KB.
