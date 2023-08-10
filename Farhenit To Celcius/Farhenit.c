#include<stdio.h>
#include<stdlib.h>
#include<stdio.h>

int main()
{
    float temperature,celcius;
    printf("Enter tempereture in farhenit:");
    scanf("%f", &temperature);
    celcius = ((temperature - 32) * 5) / 9;
    printf("Temperature in Celcius = %f ",celcius);
    return 0;
}