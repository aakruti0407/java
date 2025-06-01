#include<stdio.h>
#include<conio.h>

void main()
{
     FILE *fp;
     int rno,r;
     char sname[50],sn[50];
     double per,p;
     clrscr();
     fp=fopen("tops1.txt","w");
     printf("\nEnter student Name:");
     gets(sname);
     printf("\nEnter student's percentage:");
     scanf("%lf",&per);
     fprintf(fp,"%s %d %lf",sname,rno,per);
     fclose(fp);
     fp=fopen("tops1.txt","r");
     fscanf(fp,"%s %d %lf",&sn,&r,&p);
     printf("\nStudent Name Is:%s",sn);
     printf("\nStudent Roll No:%d",r);
     printf("\nStudent's percentage:%lf",p);
     fclose(fp);
     getch();
}
