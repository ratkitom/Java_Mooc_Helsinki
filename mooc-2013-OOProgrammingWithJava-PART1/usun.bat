echo off

rmdir /s /q %1\lib
rmdir /s /q %1\nbproject
rmdir /s /q %1\test
del /q %1\*.*