
int main()
{
    int total_number_of_shelves;
    scanf("%d", &total_number_of_shelves);
    int total_number_of_queries;
    scanf("%d", &total_number_of_queries);
    total_number_of_books=(int*)malloc(sizeof(int)*total_number_of_shelves);
    total_number_of_pages=(int**)malloc(sizeof(int*)*total_number_of_shelves);
    for(int i=0; i<total_number_of_shelves; i++){
        total_number_of_books[i]=0;
        total_number_of_pages[i]=(int*)malloc(sizeof(int));
    }
    while (total_number_of_queries--) {
        int type_of_query;
        scanf("%d", &type_of_query);   
        if (type_of_query == 1) {
            int x, y;
            scanf("%d %d", &x, &y);
            *(total_number_of_books+x)+=1;
            *(total_number_of_pages+x)=realloc(*(total_number_of_pages+x), *(total_number_of_books+x)*sizeof(int));
            *(*(total_number_of_pages+x)+*(total_number_of_books+x)-1)=y;
