

char* kth_word_in_mth_sentence_of_nth_paragraph(char**** document, int k, int m, int n) {
    return document[n-1][m-1][k-1];
}

char** kth_sentence_in_mth_paragraph(char**** document, int k, int m) { 
    return document[m-1][k-1];
}

char*** kth_paragraph(char**** document, int k) {
    return document[k-1];
}

char**** get_document(char* text) {
    int i=0,p=1,s=1,w=1;
    char ****document;
    document=(char****)malloc(sizeof(char***));
    document[0]=(char***)malloc(sizeof(char**));
    document[0][0]=(char**)malloc(sizeof(char*));
    document[0][0][0]=text;
    for(i=0;text[i+1]!=0;i++)
    {
        if(text[i+1]=="\n")
        {
            text[i++]=0;
        }
        switch(text[i]){
            case '\n':
            document=(char**** )realloc(document,++p*sizeof(char***));
            s=0;
            case '.':
            document[p-1]=(char***)realloc(document[p-1],++s*sizeof(char**));
            w=0; 
            case ' ':
            document[p-1][s-1]=(char**)realloc(document[p-1][s-1],++w*sizeof(char*));
            document[p-1][s-1][w-1]=&text[i+1];
            text[i]=0;
            break;

        } 
    }
    text[i]=0;
    return document;
}

