#include<stdio.h>
#include<conio.h>

void main()
{
     FILE *fp;
     char data[50];
     clrscr();
     fp=fopen("tops2.txt","w");
     printf("\nEnter data to write to the file:");
     gets (data);
     fputs(data,fp);
     fclose(fp);

     fp=fopen("tops2.txt","r");
     while(fgets(data,50,fp)!=NULL)
     {
	printf("%s",data);
     }
     fclose(fp);
     getch();
}