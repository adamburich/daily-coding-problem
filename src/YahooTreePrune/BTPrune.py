class Node:
   def __init__(self, data):
      self.left = None
      self.right = None
      self.data = data
   def PrintTree(self):
      print(self.data)


def prune(someRootNode):
   while(someRootNode.left != None or someRootNode.right != None):
      if(someRootNode.left !=  None and someRootNode.right != None):
         continue
      else:
         if(someRootNode.left == None):
            someRootNode = someRootNode.right
         elif(someRootNode.right == None):
            someRootNode = someRootNode.left


root = Node(0)

root.left = Node(1)
root.left.left = Node(3)
root.left.left.right = Node(5)

root.right = Node(2)
root.right.right = Node(4)
root.right.right.left = Node(6)
root.right.right.right = Node(7)

root.PrintTree()
prune(root)
root.PrintTree()

#Not sure if this works, I know the PrintTree function doesn't actually print the whole tree also so haven't really tested