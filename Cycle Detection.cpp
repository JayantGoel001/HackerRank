bool has_cycle(SinglyLinkedListNode* head) {
    map<SinglyLinkedListNode*,bool> m;
    while(head!=NULL){
        if(m.count(head)==0){
            m.insert(make_pair(head,true));
        }
        else{
            return true;
        }
        head = head->next;
    }
    return false;
}