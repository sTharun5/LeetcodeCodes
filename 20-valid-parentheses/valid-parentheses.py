class Solution(object):
    def isValid(self, s):
        """
        :type s: str
        :rtype: bool
        """
        list=[]
        
        for bracket in s:
            if bracket == '(':
                list.append(')')
                
            elif bracket == '{':
                list.append('}')
               
            elif bracket == '[':
                list.append(']')
               
            else:
                if len(list) == 0:
                    return False
                if bracket == list[len(list)-1]:
                    list.pop()
                else:
                    return False
            
            
       
        return len(list) == 0            
                    


        