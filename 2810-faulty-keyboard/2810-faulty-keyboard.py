class Solution:
    def finalString(self, s: str) -> str:
        output=""
        for i in s:
            if i=='i':
                output=output[::-1]
                continue
            output+=i 
        return output