// Online C compiler to run C program online
#include <stdio.h>

void incr_by_bdays(int month, int day, int year, long no_of_days, int* nMonth, int* nDay, int* nYear);
void next_day(int *nMonth, int *nDay, int* nYear);

int is_leap(int y) {
    return ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0);
}

int main() {
    int nMonth;
    int nDays;
    int nYear;
    
    incr_by_bdays(12, 31, 2016, 20, &nMonth, &nDays, &nYear);
    return 0;
}

void incr_by_bdays(int month, int day, int year, long no_of_days, int* nMonth, int* nDay, int* nYear )
{
  *nDay = day;
  *nMonth = month;
  *nYear = year;

  printf("Old date is : %d / %d / %d\n", month, day, year);
  for(int i = 0; i < no_of_days; i++)
    next_day(nMonth,nDay,nYear);
  printf("New date is : %d / %d / %d", *nMonth, *nDay, *nYear);
}

void next_day(int *nMonth, int *nDay, int* nYear)
{
    int month_count[] = {31,28,31,30,31,30,31,31,30,31,30,31};
    
    if(is_leap(*nYear))
        month_count[1] = 29;
    
    if(((*nDay) + 1) > month_count[(*nMonth) - 1])
    {
        if(*nMonth == 12)
        {
            (*nYear)++;
            (*nMonth) = 1;
        }
        else
        {
           (*nMonth)++;
        }
        (*nDay) = 1;
    }
    else
    {
        (*nDay)++;
    }
}