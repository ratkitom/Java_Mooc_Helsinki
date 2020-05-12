echo off

rmdir /s /q %1\build
rmdir /s /q %1\nbproject
rmdir /s /q %1\test
del /q %1\*.*