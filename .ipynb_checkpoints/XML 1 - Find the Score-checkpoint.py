def get_attr_number(node):
    s=0
    for i in node.iter():
        s+=len(i.items())
    return s