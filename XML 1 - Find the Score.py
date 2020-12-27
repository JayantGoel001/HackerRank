

def get_attr_number(node):
    #tree=etree.ElementTree(etree.fromstring(xml))
    s=0
    for i in node.iter():
        s+=len(i.items())
    return s
