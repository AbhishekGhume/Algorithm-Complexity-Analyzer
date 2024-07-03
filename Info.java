import java.util.LinkedHashMap;
public class Info {
    LinkedHashMap<String, LinkedHashMap<String, String>> subOptionsMap; // LinkedHashMap to store suboptions for each category
    LinkedHashMap<String, LinkedHashMap<String, String>> explanationMap; // LinkedHashMap to store explanations for each suboption

    public Info() {
        // Initialize and populate the subOptionsMap
        subOptionsMap = new LinkedHashMap<>();
        explanationMap = new LinkedHashMap<>();
        populateSubOptionsMap();
        populateExplanationMap();
    }

    public void populateSubOptionsMap() {
        // Defining suboptions for each category and storing in the LinkedHashMap
        LinkedHashMap<String, String> searchingAlgorithmsSubOptions = new LinkedHashMap<>();
        searchingAlgorithmsSubOptions.put("Linear Search", "Worst Case: O(n), Average Case: O(n), Best Case: O(1), Space Complexity: O(1)");
        searchingAlgorithmsSubOptions.put("Binary Search", "Worst Case: O(log n), Average Case: O(log n), Best Case: O(1), Space Complexity: O(1)");
        subOptionsMap.put("Searching Algorithms", searchingAlgorithmsSubOptions);

        LinkedHashMap<String, String> sortingAlgorithmsSubOptions = new LinkedHashMap<>();
        sortingAlgorithmsSubOptions.put("Bubble Sort", "Worst Case: O(n^2), Average Case: O(n^2), Best Case: O(n), Space Complexity: O(1)");
        sortingAlgorithmsSubOptions.put("Insertion Sort", "Worst Case: O(n^2), Average Case: O(n^2), Best Case: O(n), Space Complexity: O(1)");
        sortingAlgorithmsSubOptions.put("Quick Sort", "Worst Case: O(n^2), Average Case: O(nlogn), Best Case: O(nlogn), Space Complexity: O(logn)");
        subOptionsMap.put("Sorting Algorithms", sortingAlgorithmsSubOptions);

        LinkedHashMap<String, String> stackAlgorithmsSubOptions = new LinkedHashMap<>();
        stackAlgorithmsSubOptions.put("Push", "Worst Case: O(1), Average Case: O(1), Best Case: O(1), Space Complexity: O(1)");
        stackAlgorithmsSubOptions.put("Pop", "Worst Case: O(1), Average Case: O(1), Best Case: O(1), Space Complexity: O(1)");
        stackAlgorithmsSubOptions.put("Top", "Worst Case: O(1), Average Case: O(1), Best Case: O(1), Space Complexity: O(1)");
        stackAlgorithmsSubOptions.put("Size", "Worst Case: O(1), Average Case: O(1), Best Case: O(1), Space Complexity: O(1)");
        stackAlgorithmsSubOptions.put("isEmpty", "Worst Case: O(1), Average Case: O(1), Best Case: O(1), Space Complexity: O(1)");
        subOptionsMap.put("Stack", stackAlgorithmsSubOptions);

        LinkedHashMap<String, String> queueAlgorithmsSubOptions = new LinkedHashMap<>();
        queueAlgorithmsSubOptions.put("Enqueue", "Worst Case: O(1), Average Case: O(1), Best Case: O(1), Space Complexity: O(1)");
        queueAlgorithmsSubOptions.put("Dequeue", "Worst Case: O(1), Average Case: O(1), Best Case: O(1), Space Complexity: O(1)");
        queueAlgorithmsSubOptions.put("Front", "Worst Case: O(1), Average Case: O(1), Best Case: O(1), Space Complexity: O(1)");
        queueAlgorithmsSubOptions.put("Rear", "Worst Case: O(1), Average Case: O(1), Best Case: O(1), Space Complexity: O(1)");
        queueAlgorithmsSubOptions.put("Size", "Worst Case: O(1), Average Case: O(1), Best Case: O(1), Space Complexity: O(1)");
        queueAlgorithmsSubOptions.put("isEmpty", "Worst Case: O(1), Average Case: O(1), Best Case: O(1), Space Complexity: O(1)");
        subOptionsMap.put("Queue", queueAlgorithmsSubOptions);

        LinkedHashMap<String, String> llAlgorithmsSubOptions = new LinkedHashMap<>();
        llAlgorithmsSubOptions.put("Create", "Worst Case: O(1), Average Case: O(n), Best Case: O(n), Space Complexity: O(n)");
        llAlgorithmsSubOptions.put("Display", "Worst Case: O(1), Average Case: O(n), Best Case: O(n), Space Complexity: O(1)");
        llAlgorithmsSubOptions.put("Size", "Worst Case: O(1), Average Case: O(n), Best Case: O(n), Space Complexity: O(1)");
        llAlgorithmsSubOptions.put("Search", "Worst Case: O(1), Average Case: O(n), Best Case: O(n), Space Complexity: O(1)");
        llAlgorithmsSubOptions.put("Reverse", "Worst Case: O(n), Average Case: O(n), Best Case: O(n), Space Complexity: O(1)");
        llAlgorithmsSubOptions.put("Insert At Start", "Worst Case: O(1), Average Case: O(1), Best Case: O(1), Space Complexity: O(1)");
        llAlgorithmsSubOptions.put("Insert At Middle", "Worst Case: O(1), Average Case: O(n), Best Case: O(n), Space Complexity: O(1)");
        llAlgorithmsSubOptions.put("Insert At Given Index", "Worst Case: O(1), Average Case: O(n), Best Case: O(n), Space Complexity: O(1)");
        llAlgorithmsSubOptions.put("Insert At End", "Worst Case: O(1), Average Case: O(1), Best Case: O(1), Space Complexity: O(1)");
        llAlgorithmsSubOptions.put("Delete From Start", "Worst Case: O(1), Average Case: O(1), Best Case: O(1), Space Complexity: O(1)");
        llAlgorithmsSubOptions.put("Delete From Middle", "Worst Case: O(1), Average Case: O(n), Best Case: O(n), Space Complexity: O(1)");
        llAlgorithmsSubOptions.put("Delete From Given Index", "Worst Case: O(1), Average Case: O(n), Best Case: O(n), Space Complexity: O(1)");
        llAlgorithmsSubOptions.put("Delete From End", "Worst Case: O(n), Average Case: O(n), Best Case: O(n), Space Complexity: O(1)");
        subOptionsMap.put("Linked List", llAlgorithmsSubOptions);

        LinkedHashMap<String, String> treeAlgorithmsSubOptions = new LinkedHashMap<>();
        treeAlgorithmsSubOptions.put("Create Binary Tree", "Worst Case: O(1), Average Case: O(n), Best Case: O(n), Space Complexity: O(n)");
        treeAlgorithmsSubOptions.put("Create Binary Search Tree", "Worst Case: O(1), Average Case: O(log n), Best Case: O(n), Space Complexity: O(n)");
        treeAlgorithmsSubOptions.put("Pre-order Traversal", "Worst Case: O(n), Average Case: O(n), Best Case: O(n), Space Complexity: O(h)");
        treeAlgorithmsSubOptions.put("In-order Traversal", "Worst Case: O(n), Average Case: O(n), Best Case: O(n), Space Complexity: O(h)");
        treeAlgorithmsSubOptions.put("Post-order Traversal", "Worst Case: O(n), Average Case: O(n), Best Case: O(n), Space Complexity: O(h)");
        treeAlgorithmsSubOptions.put("Level-order Traversal", "Worst Case: O(n), Average Case: O(n), Best Case: O(n), Space Complexity: O(w)");
        treeAlgorithmsSubOptions.put("Search Node in Binary Tree", "Worst Case: O(1), Average Case: O(n), Best Case: O(n), Space Complexity: O(h)");
        treeAlgorithmsSubOptions.put("Search Node in Binary Search Tree", "Worst Case: O(1), Average Case: O(log n), Best Case: O(n), Space Complexity: O(h)");
        treeAlgorithmsSubOptions.put("Height of Tree", "Worst Case: O(1), Average Case: O(n), Best Case: O(n), Space Complexity: O(h)");
        treeAlgorithmsSubOptions.put("Diameter of Tree", "Worst Case: O(n), Average Case: O(n^2), Best Case: O(n^2), Space Complexity: O(h)");
        treeAlgorithmsSubOptions.put("Size of Tree", "Worst Case: O(1), Average Case: O(n), Best Case: O(n), Space Complexity: O(h)");
        treeAlgorithmsSubOptions.put("Sum of values of nodes in Tree", "Worst Case: O(1), Average Case: O(n), Best Case: O(n), Space Complexity: O(h)");
        subOptionsMap.put("Tree", treeAlgorithmsSubOptions);

        LinkedHashMap<String, String> graphAlgorithmsSubOptions = new LinkedHashMap<>();
        graphAlgorithmsSubOptions.put("Create Graph using Adjacency Matrix", "Worst Case: O(V^2), Average Case: O(V^2), Best Case: O(V^2), Space Complexity: O(V^2)");
        graphAlgorithmsSubOptions.put("Create Graph using Adjacency List (ArrayList of ArrayList)", "Worst Case: O(V), Average Case: O(V+E), Best Case: O(V+E), Space Complexity: O(V+E)");
        graphAlgorithmsSubOptions.put("Create Graph using Adjacency List (Array of ArrayList)", "Worst Case: O(V), Average Case: O(V+E), Best Case: O(V+E), Space Complexity: O(V+E)");
        graphAlgorithmsSubOptions.put("Breadth First Search (BFS)", "Worst Case: O(1), Average Case: O(V+E), Best Case: O(V+E), Space Complexity: O(V)");
        graphAlgorithmsSubOptions.put("Depth First Search (DFS)", "Worst Case: O(1), Average Case: O(V+E), Best Case: O(V+E), Space Complexity: O(V)");
        subOptionsMap.put("Graph", graphAlgorithmsSubOptions);
    }

    public void populateExplanationMap() {
        // Populate explanations for each suboption
        LinkedHashMap<String, String> linearSearchExplanation = new LinkedHashMap<>();
        linearSearchExplanation.put("Best Case", "When the target element is found at the beginning of the array, requiring only one comparison.");
        linearSearchExplanation.put("Average Case", "When the target element is found in the middle of the array or not found at all, necessitating searching through half of the array on average.");
        linearSearchExplanation.put("Worst Case", "When the target element is found at the end of the array or not found at all, requiring searching through the entire array.");
        linearSearchExplanation.put("Space Complexity", "Constant space usage, as linear search only needs a few variables for iteration and comparison, regardless of the input size.");
        explanationMap.put("Linear Search", linearSearchExplanation);

        LinkedHashMap<String, String> binarySearchExplanation = new LinkedHashMap<>();
        binarySearchExplanation.put("Best Case", "When the target element is found at the middle of the array in the first comparison.");
        binarySearchExplanation.put("Average Case", "When the target element is found in the middle after several comparisons, reducing the search space by half in each iteration");
        binarySearchExplanation.put("Worst Case", "When the target element is at the extremes of the array or not found, halving the search space in each iteration until the target is found or the array is exhausted.");
        binarySearchExplanation.put("Space Complexity", "Binary search typically requires constant extra space for storing a few variables, regardless of the input size.");
        explanationMap.put("Binary Search", binarySearchExplanation);

        LinkedHashMap<String, String> bubbleSortExplanation = new LinkedHashMap<>();
        bubbleSortExplanation.put("Best Case", "When the input array is already sorted, requiring only one pass to confirm.");
        bubbleSortExplanation.put("Average Case", "When elements are randomly ordered, leading to multiple passes and comparisons.");
        bubbleSortExplanation.put("Worst Case", "When the input array is sorted in reverse order, necessitating the maximum number of passes and comparisons.");
        bubbleSortExplanation.put("Space Complexity", "Constant space usage, as bubble sort operates in-place without requiring additional memory proportional to the input size.");
        explanationMap.put("Bubble Sort", bubbleSortExplanation);

        LinkedHashMap<String, String> insertionSortExplanation = new LinkedHashMap<>();
        insertionSortExplanation.put("Best Case", "When the input array is already sorted, requiring only one pass to confirm each element is in the correct position.");
        insertionSortExplanation.put("Average Case", "When elements are randomly ordered, leading to multiple passes and comparisons for each element.");
        insertionSortExplanation.put("Worst Case", " When the input array is sorted in reverse order, necessitating the maximum number of passes and comparisons for each element.");
        insertionSortExplanation.put("Space Complexity", "Constant space usage, as insertion sort operates in-place without requiring additional memory proportional to the input size.");
        explanationMap.put("Insertion Sort", insertionSortExplanation);

        LinkedHashMap<String, String> quickSortExplanation = new LinkedHashMap<>();
        quickSortExplanation.put("Best Case", "This occurs when the pivot chosen in each partition step divides the array into two equal parts. Quick sort then recursively sorts each half with the same efficiency as merge sort.");
        quickSortExplanation.put("Average Case", "On average, quick sort performs well because it divides the array into roughly equal partitions, leading to balanced recursive calls.");
        quickSortExplanation.put("Worst Case", "This occurs when the pivot chosen is either the smallest or largest element in the array, causing one partition to have all elements but one, leading to unbalanced partitions. This usually happens when the input array is already sorted or nearly sorted.");
        quickSortExplanation.put("Space Complexity", "This is the space required for the recursive calls in the call stack. In the best and average cases, quick sort has a logarithmic space complexity because it recursively divides the array into halves. However, in the worst case, it can degrade to O(n) due to unbalanced partitions, resulting in more recursive calls. Additionally, quick sort is typically performed in-place, meaning it doesn't require additional space proportional to the input size beyond the call stack.");
        explanationMap.put("Quick Sort", quickSortExplanation);

        LinkedHashMap<String, String> pushExplanation = new LinkedHashMap<>();
        pushExplanation.put("Best Case", "When pushing an element onto a stack, the best case time complexity is constant. This occurs when the stack has available space, and inserting an element simply requires updating the top pointer and placing the new element at that position.");
        pushExplanation.put("Average Case", "In an average case scenario, the time complexity for pushing an element onto a stack remains constant. This holds true regardless of the stack's current size or the number of elements it contains.");
        pushExplanation.put("Worst Case", "The worst case time complexity for the push operation on a stack is also constant. This holds true even when the stack is full, as long as the implementation dynamically resizes the underlying array or utilizes a linked list structure.");
        pushExplanation.put("Space Complexity", "The space complexity for the push operation on a stack is constant. This is because only a single element is added to the stack, and the space required does not depend on the size of the stack or the number of elements it contains.");
        explanationMap.put("Push", pushExplanation);

        LinkedHashMap<String, String> popExplanation = new LinkedHashMap<>();
        popExplanation.put("Best Case", "When popping an element from a stack, the best case time complexity is constant. This occurs when the stack is not empty, and removing an element simply requires updating the top pointer to point to the previous element.");
        popExplanation.put("Average Case", "In an average case scenario, the time complexity for popping an element from a stack remains constant. This holds true regardless of the stack's current size or the number of elements it contains.");
        popExplanation.put("Worst Case", "The worst case time complexity for the pop operation on a stack is also constant. This holds true even when the stack is empty, as long as proper error handling is in place to check for underflow conditions.");
        popExplanation.put("Space Complexity", "The space complexity for the pop operation on a stack is constant. This is because only one element is removed from the stack, and the space required does not depend on the size of the stack or the number of elements it contains.");
        explanationMap.put("Pop", popExplanation);

        LinkedHashMap<String, String> topExplanation = new LinkedHashMap<>();
        topExplanation.put("Best Case", "The best case time complexity for the top method in a stack is constant. This occurs when the stack is not empty, and accessing the top element simply involves returning the value stored at the top of the stack without any traversal or iteration.");
        topExplanation.put("Average Case", "In an average case scenario, the time complexity for the top method remains constant. This holds true regardless of the stack's current size or the number of elements it contains.");
        topExplanation.put("Worst Case", "The worst case time complexity for the top operation on a stack is also constant. This holds true even when the stack is empty, as long as proper error handling is in place to handle underflow conditions.");
        topExplanation.put("Space Complexity", "The space complexity for the top method on a stack is constant. This is because accessing the top element does not involve any additional memory allocation or modification of the stack structure, regardless of the stack's size or the number of elements it contains.");
        explanationMap.put("Top", topExplanation);

        LinkedHashMap<String, String> stSizeExplanation = new LinkedHashMap<>();
        stSizeExplanation.put("Best Case", "The best case time complexity for the size method in a stack is constant. This occurs when the stack is implemented with a variable that tracks the size of the stack, so accessing the size simply involves returning this value.");
        stSizeExplanation.put("Average Case", "In an average case scenario, the time complexity for the size method remains constant. This holds true regardless of the stack's current size or the number of elements it contains.");
        stSizeExplanation.put("Worst Case", "The worst case time complexity for the size operation on a stack is also constant. This holds true regardless of the size of the stack because accessing the size involves retrieving a pre-calculated value rather than iterating through the elements of the stack.");
        stSizeExplanation.put("Space Complexity", "The space complexity for the size method on a stack is constant. This is because accessing the size does not require any additional memory allocation or modification of the stack structure, regardless of the stack's size or the number of elements it contains.");
        explanationMap.put("Size", stSizeExplanation);

        LinkedHashMap<String, String> stIsEmptyExplanation = new LinkedHashMap<>();
        stIsEmptyExplanation.put("Best Case", "The best case time complexity for the isEmpty method in a stack is constant. This occurs when the stack is implemented with a variable or flag that tracks whether the stack is empty, so checking if the stack is empty involves a simple comparison operation.");
        stIsEmptyExplanation.put("Average Case", "In an average case scenario, the time complexity for the isEmpty method remains constant. This holds true regardless of the stack's current size or the number of elements it contains.");
        stIsEmptyExplanation.put("Worst Case", "The worst case time complexity for the isEmpty operation on a stack is also constant. This holds true regardless of the size of the stack because checking if the stack is empty involves a single comparison operation.");
        stIsEmptyExplanation.put("Space Complexity", "The space complexity for the isEmpty method on a stack is constant. This is because checking if the stack is empty does not require any additional memory allocation or modification of the stack structure, regardless of the stack's size or the number of elements it contains.");
        explanationMap.put("isEmpty", stIsEmptyExplanation);

        LinkedHashMap<String, String> enqueueExplanation = new LinkedHashMap<>();
        enqueueExplanation.put("Best Case", "The best case time complexity for the Enqueue method occurs when adding an element to the back of the queue requires constant time. This happens when the queue is implemented using a linked list or a dynamic array with available space at the end.");
        enqueueExplanation.put("Average Case", "In an average case scenario, the time complexity for the Enqueue method remains constant. This holds true regardless of the queue's current size or the number of elements it contains, assuming a constant-time insertion operation.");
        enqueueExplanation.put("Worst Case", "The worst case time complexity for the Enqueue method on a queue is also constant. This occurs when adding an element to the back of the queue takes constant time, regardless of the size of the queue.");
        enqueueExplanation.put("Space Complexity", "The space complexity for the Enqueue method on a queue is constant. This is because adding an element to the back of the queue does not require additional memory allocation beyond what is already allocated for the queue, regardless of the queue's size or the number of elements it contains.");
        explanationMap.put("Enqueue", enqueueExplanation);

        LinkedHashMap<String, String> dequeueExplanation = new LinkedHashMap<>();
        dequeueExplanation.put("Best Case", "The best case time complexity for the Dequeue method occurs when removing an element from the front of the queue takes constant time. This happens when the queue is implemented using a linked list or a dynamic array, and removing the first element involves updating a pointer or index.");
        dequeueExplanation.put("Average Case", "In an average case scenario, the time complexity for the Dequeue method remains constant. This holds true regardless of the queue's current size or the number of elements it contains, assuming a constant-time removal operation.");
        dequeueExplanation.put("Worst Case", "The worst case time complexity for the Dequeue method on a queue is also constant. This occurs when removing an element from the front of the queue takes constant time, regardless of the size of the queue.");
        dequeueExplanation.put("Space Complexity", "The space complexity for the Dequeue method on a queue is constant. This is because removing an element from the front of the queue does not require additional memory allocation beyond what is already allocated for the queue, regardless of the queue's size or the number of elements it contains.");
        explanationMap.put("Dequeue", dequeueExplanation);

        LinkedHashMap<String, String> frontExplanation = new LinkedHashMap<>();
        frontExplanation.put("Best Case", "The best case time complexity for the Front method occurs when accessing the front element of the queue takes constant time. This happens when the queue is implemented using a linked list or a dynamic array, and accessing the first element involves directly accessing a pointer or index.");
        frontExplanation.put("Average Case", "In an average case scenario, the time complexity for the Front method remains constant. This holds true regardless of the queue's current size or the number of elements it contains, assuming a constant-time access operation.");
        frontExplanation.put("Worst Case", "The worst case time complexity for the Front method on a queue is also constant. This occurs when accessing the front element of the queue takes constant time, regardless of the size of the queue.");
        frontExplanation.put("Space Complexity", "The space complexity for the Front method on a queue is constant. This is because accessing the front element does not require additional memory allocation beyond what is already allocated for the queue, regardless of the queue's size or the number of elements it contains.");
        explanationMap.put("Front", frontExplanation);

        LinkedHashMap<String, String> rearExplanation = new LinkedHashMap<>();
        rearExplanation.put("Best Case", "The best case time complexity for the Rear method occurs when accessing the rear element of the queue takes constant time. This happens when the queue is implemented using a linked list or a dynamic array, and accessing the last element involves directly accessing a pointer or index.");
        rearExplanation.put("Average Case", "In an average case scenario, the time complexity for the Rear method remains constant. This holds true regardless of the queue's current size or the number of elements it contains, assuming a constant-time access operation.");
        rearExplanation.put("Worst Case", "The worst case time complexity for the Rear method on a queue is also constant. This occurs when accessing the rear element of the queue takes constant time, regardless of the size of the queue.");
        rearExplanation.put("Space Complexity", "The space complexity for the Rear method on a queue is constant. This is because accessing the rear element does not require additional memory allocation beyond what is already allocated for the queue, regardless of the queue's size or the number of elements it contains.");
        explanationMap.put("Rear", rearExplanation);

        LinkedHashMap<String, String> qSizeExplanation = new LinkedHashMap<>();
        qSizeExplanation.put("Best Case", "The best case time complexity for the Size method occurs when accessing the size of the queue takes constant time. This happens when the queue is implemented with a variable that tracks the size of the queue, so accessing the size simply involves returning this value.");
        qSizeExplanation.put("Average Case", "In an average case scenario, the time complexity for the Size method remains constant. This holds true regardless of the queue's current size or the number of elements it contains, assuming a constant-time size retrieval operation.");
        qSizeExplanation.put("Worst Case", "The worst case time complexity for the Size method on a queue is also constant. This occurs when accessing the size of the queue takes constant time, regardless of the size of the queue.");
        qSizeExplanation.put("Space Complexity", "The space complexity for the Size method on a queue is constant. This is because accessing the size does not require additional memory allocation beyond what is already allocated for the queue, regardless of the queue's size or the number of elements it contains.");
        explanationMap.put("Size", qSizeExplanation);

        LinkedHashMap<String, String> qIsEmptyExplanation = new LinkedHashMap<>();
        qIsEmptyExplanation.put("Best Case", "The best case time complexity for the isEmpty method occurs when checking if the queue is empty takes constant time. This happens when the queue implementation directly stores a flag indicating whether the queue is empty or not.");
        qIsEmptyExplanation.put("Average Case", "In an average case scenario, the time complexity for the isEmpty method remains constant. This holds true regardless of the queue's current size or the number of elements it contains, assuming a constant-time operation to check if the queue is empty.");
        qIsEmptyExplanation.put("Worst Case", "The worst case time complexity for the isEmpty method is also constant. This occurs when checking if the queue is empty takes constant time, regardless of the size of the queue.");
        qIsEmptyExplanation.put("Space Complexity", "The space complexity for the isEmpty method is constant. This is because storing a flag indicating whether the queue is empty or not requires a fixed amount of memory, regardless of the number of elements in the queue.");
        explanationMap.put("isEmpty", qIsEmptyExplanation);

        LinkedHashMap<String, String> llCreateExplanation = new LinkedHashMap<>();
        llCreateExplanation.put("Best Case", "The best case occurs when creating the list with no elements, so the time complexity is constant. This is because creating an empty list involves simply initializing the head pointer to null or a sentinel node, requiring constant time.");
        llCreateExplanation.put("Average Case", "In an average case scenario, the time complexity for creating a singly linked list is linear. This is because each element needs to be allocated and linked to the previous one, requiring n operations to create a list of size n.");
        llCreateExplanation.put("Worst Case", "The worst case time complexity for creating a singly linked list is also linear. This occurs when creating a list with n elements, where each element needs to be allocated and linked in sequence.");
        llCreateExplanation.put("Space Complexity", "The space complexity for creating a singly linked list is linear. This is because each node in the list requires memory allocation, and the space required grows linearly with the number of elements in the list.");
        explanationMap.put("Create", llCreateExplanation);

        LinkedHashMap<String, String> llDisplayExplanation = new LinkedHashMap<>();
        llDisplayExplanation.put("Best Case", "The best case occurs when the list is empty, and no elements need to be displayed. In this case, the time complexity is constant because there is nothing to display.");
        llDisplayExplanation.put("Average Case", "In an average case scenario, the time complexity for displaying a singly linked list is linear. This is because each node in the list needs to be visited and printed exactly once, requiring n operations to display a list of size n.");
        llDisplayExplanation.put("Worst Case", "The worst case time complexity for displaying a singly linked list is also linear. This occurs when displaying a list with n elements, where each element needs to be visited and printed in sequence.");
        llDisplayExplanation.put("Space Complexity", "The space complexity for displaying a singly linked list is constant. This is because displaying the elements does not require any additional memory allocation beyond what is already allocated for the list itself. Only a constant amount of memory is required for variables used during traversal, regardless of the size of the list.");
        explanationMap.put("Display", llDisplayExplanation);

        LinkedHashMap<String, String> llSizeExplanation = new LinkedHashMap<>();
        llSizeExplanation.put("Best Case", "The best case occurs when the list is empty, and the size is directly accessible. In this case, determining the size of the list requires only a single operation, such as checking if the head pointer is null. Hence, the time complexity is constant.");
        llSizeExplanation.put("Average Case", "In an average case scenario, the time complexity for calculating the size of a singly linked list is linear. This is because each node in the list needs to be traversed exactly once to count the number of elements, requiring n operations to calculate the size of a list with n elements.");
        llSizeExplanation.put("Worst Case", "The worst case time complexity for calculating the size of a singly linked list is also linear. This occurs when traversing the entire list is necessary to count the number of elements, such as when the size is required for each operation or when there is no additional information available about the list.");
        llSizeExplanation.put("Space Complexity", "The space complexity for calculating the size of a singly linked list is constant. This is because determining the size does not require any additional memory allocation beyond a few variables used during traversal, regardless of the size of the list. Only a constant amount of memory is required, regardless of the number of elements in the list.");
        explanationMap.put("Size", llSizeExplanation);

        LinkedHashMap<String, String> llSearchExplanation = new LinkedHashMap<>();
        llSearchExplanation.put("Best Case", "The best case occurs when the target element is found at the head of the list. In this scenario, only one comparison is needed, resulting in constant time complexity.");
        llSearchExplanation.put("Average Case", "In an average case scenario, the time complexity for searching in a singly linked list is linear. This is because, on average, the target element could be located anywhere in the list, requiring traversal through roughly half of the list nodes, resulting in O(n/2), which simplifies to O(n).");
        llSearchExplanation.put("Worst Case", "The worst case time complexity for searching in a singly linked list is linear. This occurs when the target element is either located at the end of the list or is not present in the list at all, necessitating traversal through all the list nodes.");
        llSearchExplanation.put("Space Complexity", "The space complexity for searching in a singly linked list is constant. This is because the search operation only requires a few additional variables (such as a temporary pointer) to traverse the list, regardless of the size of the list. No additional memory is allocated based on the size of the list.");
        explanationMap.put("Search", llSearchExplanation);

        LinkedHashMap<String, String> llReverseExplanation = new LinkedHashMap<>();
        llReverseExplanation.put("Best Case", "The best case occurs when the list is empty or has only one element. In this case, the reversal operation still requires traversal through each node of the list once, resulting in linear time complexity.");
        llReverseExplanation.put("Average Case", "In an average case scenario, the time complexity for reversing a singly linked list is linear. This is because each node in the list needs to be visited and its pointers adjusted to reverse the order, requiring traversal through all the nodes of the list.");
        llReverseExplanation.put("Worst Case", "The worst case time complexity for reversing a singly linked list is linear. This occurs when the list has multiple elements, and each node needs to be visited and its pointers adjusted to reverse the order, requiring traversal through all the nodes of the list.");
        llReverseExplanation.put("Space Complexity", "The space complexity for reversing a singly linked list is constant. This is because the reversal operation can be performed in-place, meaning it does not require additional memory allocation proportional to the size of the list. Only a constant amount of extra memory is needed for temporary variables used during the reversal process, regardless of the size of the list.");
        explanationMap.put("Reverse", llReverseExplanation);

        LinkedHashMap<String, String> inserAtStartExplanation = new LinkedHashMap<>();
        inserAtStartExplanation.put("Best Case", "The best case occurs when inserting an element at the start of a singly linked list. This involves updating the head pointer to point to the new node and updating the next pointer of the new node to point to the previous head. Both of these operations take constant time, resulting in constant time complexity.");
        inserAtStartExplanation.put("Average Case", "In an average case scenario, the time complexity for inserting an element at the start of a singly linked list remains constant. This holds true regardless of the list's current size or the number of elements it contains.");
        inserAtStartExplanation.put("Worst Case", "The worst case time complexity for inserting an element at the start of a singly linked list is also constant. Similar to the average case, this occurs regardless of the list's size.");
        inserAtStartExplanation.put("Space Complexity", "The space complexity for inserting an element at the start of a singly linked list is constant. This is because the operation does not require additional memory allocation proportional to the size of the list. Only a constant amount of extra memory is needed for the new node being inserted.");
        explanationMap.put("Insert At Start", inserAtStartExplanation);

        LinkedHashMap<String, String> insertAtMiddleExplanation = new LinkedHashMap<>();
        insertAtMiddleExplanation.put("Best Case", "The best case occurs when inserting an element at the middle of a singly linked list and the position of insertion is known. In this case, the time complexity is constant because it involves updating pointers of neighboring nodes to include the new node.");
        insertAtMiddleExplanation.put("Average Case", "In an average case scenario, the time complexity for inserting an element at the middle of a singly linked list is linear. This happens when the position of insertion is not known in advance and requires traversal of approximately half the list nodes to reach the desired position.");
        insertAtMiddleExplanation.put("Worst Case", "The worst case time complexity for inserting an element at the middle of a singly linked list is linear. This occurs when the position of insertion is at the middle of the list or when the list is sorted and the element needs to be inserted while maintaining sorted order. In both cases, traversal through approximately half of the list nodes is required.");
        insertAtMiddleExplanation.put("Space Complexity", "The space complexity for inserting an element at the middle of a singly linked list is constant. This is because the operation does not require additional memory allocation proportional to the size of the list. Only a constant amount of extra memory is needed for the new node being inserted.");
        explanationMap.put("Insert At Middle", insertAtMiddleExplanation);

        LinkedHashMap<String, String> insertAtGivenIdxExplanation = new LinkedHashMap<>();
        insertAtGivenIdxExplanation.put("Best Case", "The best case occurs when inserting an element at a given index in a singly linked list where the index is the head (index 0). In this case, the time complexity is constant because it involves updating pointers to include the new node as the new head.");
        insertAtGivenIdxExplanation.put("Average Case", "In an average case scenario, the time complexity for inserting an element at a given index in a singly linked list is linear. This occurs when the position of insertion is not known in advance and requires traversal through approximately half of the list nodes to reach the desired index.");
        insertAtGivenIdxExplanation.put("Worst Case", "The worst case time complexity for inserting an element at a given index in a singly linked list is linear. This occurs when the desired index is at the end of the list or when the list is sorted and the element needs to be inserted while maintaining sorted order. In both cases, traversal through all the list nodes may be required.");
        insertAtGivenIdxExplanation.put("Space Complexity", "The space complexity for inserting an element at a given index in a singly linked list is constant. This is because the operation does not require additional memory allocation proportional to the size of the list. Only a constant amount of extra memory is needed for the new node being inserted.");
        explanationMap.put("Insert At Given Index", insertAtGivenIdxExplanation);

        LinkedHashMap<String, String> insertAtEndExplanation = new LinkedHashMap<>();
        insertAtEndExplanation.put("Best Case", "The best case occurs when inserting an element at the end of a singly linked list. In this case, if the list keeps a reference to the tail node, insertion can be performed in constant time by updating the next pointer of the current tail node to point to the new node and updating the tail pointer to point to the new node.");
        insertAtEndExplanation.put("Average Case", "In an average case scenario, the time complexity for inserting an element at the end of a singly linked list remains constant. This holds true regardless of the list's current size or the number of elements it contains, assuming a constant-time insertion operation.");
        insertAtEndExplanation.put("Worst Case", "The worst case time complexity for inserting an element at the end of a singly linked list is also constant. This occurs regardless of the size of the list.");
        insertAtEndExplanation.put("Space Complexity", "The space complexity for inserting an element at the end of a singly linked list is constant. This is because the operation does not require additional memory allocation proportional to the size of the list. Only a constant amount of extra memory is needed for the new node being inserted.");
        explanationMap.put("Insert At End", insertAtEndExplanation);

        LinkedHashMap<String, String> deleteFromStartExplanation = new LinkedHashMap<>();
        deleteFromStartExplanation.put("Best Case", "The best case occurs when deleting an element from the start of a singly linked list. This involves updating the head pointer to point to the next node and deallocating the memory for the removed node, both of which can be done in constant time.");
        deleteFromStartExplanation.put("Average Case", "In an average case scenario, the time complexity for deleting an element from the start of a singly linked list remains constant. This holds true regardless of the list's current size or the number of elements it contains, assuming a constant-time deletion operation.");
        deleteFromStartExplanation.put("Worst Case", "The worst case time complexity for deleting an element from the start of a singly linked list is also constant. This occurs regardless of the size of the list.");
        deleteFromStartExplanation.put("Space Complexity", "The space complexity for deleting an element from the start of a singly linked list is constant. This is because the operation does not require additional memory allocation proportional to the size of the list. Only a constant amount of extra memory is needed for temporary variables used during the deletion process.");
        explanationMap.put("Delete From Start", deleteFromStartExplanation);

        LinkedHashMap<String, String> deleteFromMiddleExplanation = new LinkedHashMap<>();
        deleteFromMiddleExplanation.put("Best Case", "The best case occurs when the element to delete is the first element after the head of the list, and its position is known. In this case, the time complexity is constant as it only involves updating pointers to remove the node.");
        deleteFromMiddleExplanation.put("Average Case", "In an average case scenario, the time complexity for deleting an element from the middle of a singly linked list is linear. This happens when the position of deletion is not known in advance and requires traversal through approximately half of the list nodes to reach the desired position.");
        deleteFromMiddleExplanation.put("Worst Case", "The worst case time complexity for deleting an element from the middle of a singly linked list is also linear. This occurs when the position of deletion is at the middle of the list or when the list is sorted, and the element needs to be deleted while maintaining sorted order. In both cases, traversal through all the list nodes may be required.");
        deleteFromMiddleExplanation.put("Space Complexity", "The space complexity for deleting an element from the middle of a singly linked list is constant. This is because the operation does not require additional memory allocation proportional to the size of the list. Only a constant amount of extra memory is needed for temporary variables used during the deletion process.");
        explanationMap.put("Delete From Middle", deleteFromMiddleExplanation);

        LinkedHashMap<String, String> deleteFromGivenIdxExplanation = new LinkedHashMap<>();
        deleteFromGivenIdxExplanation.put("Best Case", "The best case occurs when the element to delete is at the head of the list. In this case, the time complexity is constant as it only involves updating pointers to remove the node.");
        deleteFromGivenIdxExplanation.put("Average Case", "In an average case scenario, the time complexity for deleting an element from a given index in a singly linked list is linear. This occurs when the position of deletion is not known in advance and requires traversal through approximately half of the list nodes to reach the desired index.");
        deleteFromGivenIdxExplanation.put("Worst Case", "The worst case time complexity for deleting an element from a given index in a singly linked list is also linear. This occurs when the desired index is at the end of the list or when the list is sorted, and the element needs to be deleted while maintaining sorted order. In both cases, traversal through all the list nodes may be required.");
        deleteFromGivenIdxExplanation.put("Space Complexity", "The space complexity for deleting an element from a given index in a singly linked list is constant. This is because the operation does not require additional memory allocation proportional to the size of the list. Only a constant amount of extra memory is needed for temporary variables used during the deletion process.");
        explanationMap.put("Delete From Given Index", deleteFromGivenIdxExplanation);

        LinkedHashMap<String, String> deleteFromEndExplanation = new LinkedHashMap<>();
        deleteFromEndExplanation.put("Best Case", "The best case occurs when the element to delete is the last element in the list. In this case, to delete the last element, you need to traverse the entire list to update the second-to-last node's next pointer to null. This traversal requires visiting all n nodes in the list, resulting in a linear time complexity.");
        deleteFromEndExplanation.put("Average Case", "In an average case scenario, the time complexity for deleting an element from the end of a singly linked list is also linear. This occurs regardless of the list's current size or the number of elements it contains.");
        deleteFromEndExplanation.put("Worst Case", "The worst case time complexity for deleting an element from the end of a singly linked list is linear. This occurs regardless of the size of the list.");
        deleteFromEndExplanation.put("Space Complexity", "The space complexity for deleting an element from the end of a singly linked list is constant. This is because the operation does not require additional memory allocation proportional to the size of the list. Only a constant amount of extra memory is needed for temporary variables used during the deletion process.");
        explanationMap.put("Delete From End", deleteFromEndExplanation);

        LinkedHashMap<String, String> createBTExplanation = new LinkedHashMap<>();
        createBTExplanation.put("Best Case", "The best case occurs when the tree is empty, and creating the root node requires only a single operation. This results in constant time complexity.");
        createBTExplanation.put("Average Case", "In an average case scenario, the time complexity for creating a binary tree is linear. This is because each node needs to be allocated and linked to its parent and possibly its children, requiring n operations to create a tree with n nodes.");
        createBTExplanation.put("Worst Case", "The worst case time complexity for creating a binary tree is also linear. This occurs when creating a fully balanced tree or a completely unbalanced tree, both of which require n nodes to be created.");
        createBTExplanation.put("Space Complexity", "The space complexity for creating a binary tree is linear. This is because each node in the tree requires memory allocation, and the space required grows linearly with the number of nodes in the tree. Additionally, if the tree is stored using additional data structures (such as an array or a linked list), the space complexity may vary but remains linear with respect to the number of nodes in the tree.");
        explanationMap.put("Create Binary Tree", createBTExplanation);

        LinkedHashMap<String, String> createBSTExplanation = new LinkedHashMap<>();
        createBSTExplanation.put("Best Case", "The best case occurs when inserting nodes in a specific order that results in a perfectly balanced binary search tree (BST). In this case, each insertion operation will take constant time to find the correct position for insertion, resulting in a balanced tree with a height of log(n), where n is the number of nodes.");
        createBSTExplanation.put("Average Case", "In an average case scenario, the time complexity for creating a binary search tree (BST) is logarithmic. This assumes random or uniformly distributed input data. Each insertion operation traverses the tree from the root to a leaf node, resulting in a tree with a height of log(n), where n is the number of nodes.");
        createBSTExplanation.put("Worst Case", "The worst case time complexity for creating a binary search tree (BST) occurs when the input data is already sorted or in a pattern that results in a skewed tree. In such cases, the tree degenerates into a linked list, and each insertion operation takes linear time, resulting in a tree with a height of n, where n is the number of nodes.");
        createBSTExplanation.put("Space Complexity", "The space complexity for creating a binary search tree (BST) is linear. This is because each node in the tree requires memory allocation, and the space required grows linearly with the number of nodes in the tree. Additionally, if the tree is stored using additional data structures (such as an array or a linked list), the space complexity may vary but remains linear with respect to the number of nodes in the tree.");
        explanationMap.put("Create Binary Search Tree", createBSTExplanation);

        LinkedHashMap<String, String> preExplanation = new LinkedHashMap<>();
        preExplanation.put("Best Case", "The best case occurs when traversing a binary tree in preorder, and every node has a left child but no right child. In this case, the traversal visits each node exactly once, resulting in linear time complexity, where n is the number of nodes in the tree.");
        preExplanation.put("Average Case", "In an average case scenario, the time complexity for preorder traversal of a binary tree is linear. This is because each node in the tree needs to be visited exactly once, and the traversal operation has to process every node in the tree.");
        preExplanation.put("Worst Case", "The worst case time complexity for preorder traversal of a binary tree also occurs when every node has a left child but no right child, resulting in a linear time complexity similar to the average case.");
        preExplanation.put("Space Complexity", "The space complexity for preorder traversal of a binary tree is determined by the maximum height of the tree, denoted as h. This is because the recursive approach commonly used for preorder traversal requires space on the call stack proportional to the height of the tree due to the recursive function calls. In the worst case scenario, the tree is skewed, resulting in a height of n (where n is the number of nodes), leading to O(n) space complexity. However, in a balanced binary tree, the height is log(n), resulting in O(log(n)) space complexity.");
        explanationMap.put("Pre-order Traversal", preExplanation);

        LinkedHashMap<String, String> inExplanation = new LinkedHashMap<>();
        inExplanation.put("Best Case", "The best case occurs when traversing a binary tree in inorder, and every node has a left child but no right child. In this case, the traversal visits each node exactly once, resulting in linear time complexity, where n is the number of nodes in the tree.");
        inExplanation.put("Average Case", "In an average case scenario, the time complexity for inorder traversal of a binary tree is linear. This is because each node in the tree needs to be visited exactly once, and the traversal operation has to process every node in the tree.");
        inExplanation.put("Worst Case", "The worst case time complexity for inorder traversal of a binary tree also occurs when every node has a left child but no right child, resulting in a linear time complexity similar to the average case.");
        inExplanation.put("Space Complexity", "The space complexity for inorder traversal of a binary tree is determined by the maximum height of the tree, denoted as h. This is because the recursive approach commonly used for inorder traversal requires space on the call stack proportional to the height of the tree due to the recursive function calls. In the worst case scenario, the tree is skewed, resulting in a height of n (where n is the number of nodes), leading to O(n) space complexity. However, in a balanced binary tree, the height is log(n), resulting in O(log(n)) space complexity.");
        explanationMap.put("In-order Traversal", inExplanation);

        LinkedHashMap<String, String> postExplanation = new LinkedHashMap<>();
        postExplanation.put("Best Case", "The best case occurs when traversing a binary tree in postorder, and every node has a left child but no right child. In this case, the traversal visits each node exactly once, resulting in linear time complexity, where n is the number of nodes in the tree.");
        postExplanation.put("Average Case", "In an average case scenario, the time complexity for postorder traversal of a binary tree is linear. This is because each node in the tree needs to be visited exactly once, and the traversal operation has to process every node in the tree.");
        postExplanation.put("Worst Case", "The worst case time complexity for postorder traversal of a binary tree also occurs when every node has a left child but no right child, resulting in a linear time complexity similar to the average case.");
        postExplanation.put("Space Complexity", "The space complexity for postorder traversal of a binary tree is determined by the maximum height of the tree, denoted as h. This is because the recursive approach commonly used for postorder traversal requires space on the call stack proportional to the height of the tree due to the recursive function calls. In the worst case scenario, the tree is skewed, resulting in a height of n (where n is the number of nodes), leading to O(n) space complexity. However, in a balanced binary tree, the height is log(n), resulting in O(log(n)) space complexity.");
        explanationMap.put("Post-order Traversal", postExplanation);

        LinkedHashMap<String, String> levelExplanation = new LinkedHashMap<>();
        levelExplanation.put("Best Case", "The best case occurs when the binary tree is balanced, and all levels have the maximum number of nodes possible. In this case, each node of the tree needs to be visited exactly once during the level-order traversal, resulting in a time complexity of O(n), where n is the number of nodes in the tree.");
        levelExplanation.put("Average Case", "In an average case scenario, the time complexity for level-order traversal of a binary tree is also linear. This occurs when the tree is partially balanced or unbalanced, and the traversal visits each node exactly once, processing every node in the tree.");
        levelExplanation.put("Worst Case", "The worst case time complexity for level-order traversal of a binary tree occurs when the tree is completely unbalanced, and all nodes are on the same level. In this case, each node of the tree needs to be visited exactly once during the traversal, resulting in a time complexity of O(n), where n is the number of nodes in the tree.");
        levelExplanation.put("Space Complexity", "The space complexity for level-order traversal of a binary tree is determined by the maximum width of the tree, denoted as w. This is because the traversal typically uses a queue to store nodes at each level, and the maximum number of nodes at any level determines the space complexity. In the worst case scenario, the maximum width of the tree is equal to the number of nodes at the last level, resulting in a space complexity of O(n), where n is the number of nodes in the tree. However, in a balanced binary tree, the maximum width is bounded by 2^h, where h is the height of the tree, resulting in a space complexity of O(2^h).");
        explanationMap.put("Level-order Traversal", levelExplanation);

        LinkedHashMap<String, String> searchBTExplanation = new LinkedHashMap<>();
        searchBTExplanation.put("Best Case", "The best case occurs when the node being searched for is the root node of the binary tree. In this case, the search operation completes immediately without needing to traverse any other nodes, resulting in constant time complexity.");
        searchBTExplanation.put("Average Case", "In an average case scenario, the time complexity for searching a node in a binary tree is linear. This is because, on average, the search operation may need to visit a substantial portion of the tree nodes to find the target node, resulting in a time complexity of O(n), where n is the number of nodes in the tree.");
        searchBTExplanation.put("Worst Case", "The worst case time complexity for searching a node in a binary tree occurs when the tree is completely unbalanced, resembling a linked list. In this scenario, the search operation may need to traverse through all the nodes of the tree, resulting in a time complexity of O(n), where n is the number of nodes in the tree.");
        searchBTExplanation.put("Space Complexity", "The space complexity for searching a node in a binary tree is determined by the maximum height of the tree, denoted as h. This is because the search operation typically uses recursion or a stack to traverse the tree, and the maximum depth of recursion or stack frames corresponds to the height of the tree. In the worst case scenario, the height of the tree is equal to the number of nodes in the tree, resulting in a space complexity of O(n), where n is the number of nodes in the tree. However, in a balanced binary tree, the height is log(n), resulting in a space complexity of O(log(n)).");
        explanationMap.put("Search Node in Binary Tree", searchBTExplanation);

        LinkedHashMap<String, String> searchBSTExplanation = new LinkedHashMap<>();
        searchBSTExplanation.put("Best Case", "The best case occurs when the node being searched for is the root node of the binary search tree (BST). In this case, the search operation completes immediately without needing to traverse any other nodes, resulting in constant time complexity.");
        searchBSTExplanation.put("Average Case", "In an average case scenario, the time complexity for searching a node in a binary search tree (BST) is logarithmic. This is because, on average, the search operation only needs to traverse a path from the root node to the target node, and at each step, it can eliminate half of the remaining nodes, resulting in a time complexity of O(log(n)), where n is the number of nodes in the tree.");
        searchBSTExplanation.put("Worst Case", "The worst case time complexity for searching a node in a binary search tree (BST) occurs when the tree is completely unbalanced, resembling a linked list. In this scenario, the search operation may need to traverse through all the nodes of the tree, resulting in a time complexity of O(n), where n is the number of nodes in the tree.");
        searchBSTExplanation.put("Space Complexity", "The space complexity for searching a node in a binary search tree (BST) is determined by the maximum height of the tree, denoted as h. This is because the search operation typically uses recursion or a stack to traverse the tree, and the maximum depth of recursion or stack frames corresponds to the height of the tree. In the worst case scenario, the height of the tree is equal to the number of nodes in the tree, resulting in a space complexity of O(n), where n is the number of nodes in the tree. However, in a balanced binary search tree, the height is log(n), resulting in a space complexity of O(log(n)).");
        explanationMap.put("Search Node in Binary Search Tree", searchBSTExplanation);

        LinkedHashMap<String, String> heightExplanation = new LinkedHashMap<>();
        heightExplanation.put("Best Case", "The best case occurs when the tree is empty (height = -1). In this case, determining the height of the tree requires only a single operation, resulting in constant time complexity.");
        heightExplanation.put("Average Case", "In an average case scenario, the time complexity for determining the height of a binary tree is linear. This is because each node in the tree needs to be visited once to calculate its height, and in the worst case, every node may need to be visited.");
        heightExplanation.put("Worst Case", "The worst case time complexity for determining the height of a binary tree occurs when the tree is completely unbalanced, resembling a linked list. In this scenario, the height of the tree is equal to the number of nodes in the tree, and each node needs to be visited once to calculate its height, resulting in a time complexity of O(n).");
        heightExplanation.put("Space Complexity", "The space complexity for determining the height of a binary tree is determined by the maximum height of the tree, denoted as h. This is because the recursive approach commonly used for calculating the height requires space on the call stack proportional to the height of the tree due to the recursive function calls. In the worst case scenario, the height of the tree is equal to the number of nodes in the tree, resulting in a space complexity of O(n). However, in a balanced binary tree, the height is log(n), resulting in a space complexity of O(log(n)).");
        explanationMap.put("Height of Tree", heightExplanation);

        LinkedHashMap<String, String> diameterExplanation = new LinkedHashMap<>();
        diameterExplanation.put("Best Case", "The best case occurs when the tree is empty or has only one node. In this case, the diameter is also 0 because there are no edges to traverse. Calculating the diameter in this case requires visiting each node once, resulting in linear time complexity.");
        diameterExplanation.put("Average Case", "In an average case scenario, the time complexity for calculating the diameter of a binary tree is quadratic. This is because, for each node, a traversal is performed to find the longest path passing through that node. Since there are n nodes, and each traversal may take O(n) time in the worst case, the overall time complexity becomes O(n^2).");
        diameterExplanation.put("Worst Case", "The worst case time complexity for calculating the diameter of a binary tree occurs when the tree is completely unbalanced, resembling a linked list. In this scenario, each traversal from one node to another may take O(n) time, and there can be up to n nodes, resulting in a time complexity of O(n^2).");
        diameterExplanation.put("Space Complexity", "The space complexity for calculating the diameter of a binary tree is determined by the maximum height of the tree, denoted as h. This is because the recursive approach commonly used for calculating the diameter requires space on the call stack proportional to the height of the tree due to the recursive function calls. In the worst case scenario, the height of the tree is equal to the number of nodes in the tree, resulting in a space complexity of O(n). However, in a balanced binary tree, the height is log(n), resulting in a space complexity of O(log(n)).");
        explanationMap.put("Diameter of Tree", diameterExplanation);

        LinkedHashMap<String, String> treeSizeExplanation = new LinkedHashMap<>();
        treeSizeExplanation.put("Best Case", "The best case occurs when the tree is empty (size = 0). In this case, determining the size of the tree requires only a single operation, resulting in constant time complexity.");
        treeSizeExplanation.put("Average Case", "In an average case scenario, the time complexity for determining the size of a binary tree is linear. This is because each node in the tree needs to be visited once to count it, and in the worst case, every node may need to be visited.");
        treeSizeExplanation.put("Worst Case", "The worst case time complexity for determining the size of a binary tree occurs when every node has both left and right children, resulting in a full binary tree. In this scenario, each node needs to be visited once to count it, resulting in a time complexity of O(n).");
        treeSizeExplanation.put("Space Complexity", "The space complexity for determining the size of a binary tree is determined by the maximum height of the tree, denoted as h. This is because the recursive approach commonly used for calculating the size requires space on the call stack proportional to the height of the tree due to the recursive function calls. In the worst case scenario, the height of the tree is equal to the number of nodes in the tree, resulting in a space complexity of O(n). However, in a balanced binary tree, the height is log(n), resulting in a space complexity of O(log(n)).");
        explanationMap.put("Size of Tree", treeSizeExplanation);

        LinkedHashMap<String, String> treeSumExplanation = new LinkedHashMap<>();
        treeSumExplanation.put("Best Case", "The best case occurs when the tree is empty (sum = 0). In this case, determining the sum of values of nodes in the tree requires only a single operation, resulting in constant time complexity.");
        treeSumExplanation.put("Average Case", "In an average case scenario, the time complexity for determining the sum of values of nodes in a tree is linear. This is because each node in the tree needs to be visited once to sum its value, and in the worst case, every node may need to be visited.");
        treeSumExplanation.put("Worst Case", "The worst case time complexity for determining the sum of values of nodes in a tree occurs when every node has both left and right children, resulting in a full binary tree. In this scenario, each node needs to be visited once to sum its value, resulting in a time complexity of O(n).");
        treeSumExplanation.put("Space Complexity", "The space complexity for determining the sum of values of nodes in a tree is determined by the maximum height of the tree, denoted as h. This is because the recursive approach commonly used for calculating the sum requires space on the call stack proportional to the height of the tree due to the recursive function calls. In the worst case scenario, the height of the tree is equal to the number of nodes in the tree, resulting in a space complexity of O(n). However, in a balanced binary tree, the height is log(n), resulting in a space complexity of O(log(n)).");
        explanationMap.put("Sum of values of nodes in Tree", treeSumExplanation);

        LinkedHashMap<String, String> matrixGraphExplanation = new LinkedHashMap<>();
        matrixGraphExplanation.put("Best Case", "The best case occurs when the graph is fully connected, meaning there is an edge between every pair of vertices. In this case, the creation of the adjacency matrix involves setting all the entries, resulting in a time complexity of O(V^2), where V is the number of vertices in the graph.");
        matrixGraphExplanation.put("Average Case", "In an average case scenario, the time complexity for creating a graph using an adjacency matrix is quadratic. This is because, on average, each vertex is connected to a constant number of other vertices, resulting in a time complexity of O(V^2), where V is the number of vertices in the graph.");
        matrixGraphExplanation.put("Worst Case", "The worst case time complexity also occurs when the graph is fully connected. In this scenario, the creation of the adjacency matrix involves setting all the entries, resulting in a time complexity of O(V^2), where V is the number of vertices in the graph.");
        matrixGraphExplanation.put("Space Complexity", "The space complexity for creating a graph using an adjacency matrix is quadratic. This is because the adjacency matrix requires storage for V^2 elements, where V is the number of vertices in the graph. Each entry in the matrix represents an edge between two vertices, so the space required is proportional to the square of the number of vertices.");
        explanationMap.put("Create Graph using Adjacency Matrix", matrixGraphExplanation);

        LinkedHashMap<String, String> alAlGraphExplanation = new LinkedHashMap<>();
        alAlGraphExplanation.put("Best Case", "The best case occurs when the graph has no edges, and each vertex has an empty adjacency list. In this case, creating the adjacency list representation involves initializing V ArrayLists, one for each vertex, and then adding no edges, resulting in a linear time complexity of O(V), where V is the number of vertices in the graph.");
        alAlGraphExplanation.put("Average Case", "In an average case scenario, the time complexity for creating a graph using an adjacency list is proportional to the number of vertices (V) and the number of edges (E) in the graph. This is because creating the adjacency list involves initializing V ArrayLists and then adding E edges to the adjacency lists, resulting in a time complexity of O(V + E).");
        alAlGraphExplanation.put("Worst Case", "The worst case time complexity also occurs when the graph has V vertices and E edges. In this scenario, creating the adjacency list representation involves initializing V ArrayLists and then adding E edges to the adjacency lists, resulting in a time complexity of O(V + E).");
        alAlGraphExplanation.put("Space Complexity", "The space complexity for creating a graph using an adjacency list is proportional to the number of vertices (V) and the number of edges (E) in the graph. This is because the adjacency list representation requires storage for V ArrayLists and E edges. Each edge is stored once in the adjacency list of its source vertex. Therefore, the space complexity is O(V + E).");
        explanationMap.put("Create Graph using Adjacency List (ArrayList of ArrayList)", alAlGraphExplanation);

        LinkedHashMap<String, String> aAlGraphExplanation = new LinkedHashMap<>();
        aAlGraphExplanation.put("Best Case", "The best case occurs when the graph has no edges, and each vertex has an empty adjacency list. In this case, creating the adjacency list representation involves initializing an array of size V (number of vertices) and then adding no edges, resulting in a linear time complexity of O(V), where V is the number of vertices in the graph.");
        aAlGraphExplanation.put("Average Case", "In an average case scenario, the time complexity for creating a graph using an adjacency list (Array of ArrayLists) is proportional to the number of vertices (V) and the number of edges (E) in the graph. This is because creating the adjacency list involves initializing an array of size V and then adding E edges to the adjacency lists, resulting in a time complexity of O(V + E).");
        aAlGraphExplanation.put("Worst Case", " The worst case time complexity also occurs when the graph has V vertices and E edges. In this scenario, creating the adjacency list representation involves initializing an array of size V and then adding E edges to the adjacency lists, resulting in a time complexity of O(V + E).");
        aAlGraphExplanation.put("Space Complexity", "The space complexity for creating a graph using an adjacency list (Array of ArrayLists) is proportional to the number of vertices (V) and the number of edges (E) in the graph. This is because the adjacency list representation requires storage for an array of size V and E edges. Each edge is stored once in the adjacency list of its source vertex. Therefore, the space complexity is O(V + E).");
        explanationMap.put("Create Graph using Adjacency List (Array of ArrayList)", aAlGraphExplanation);

        LinkedHashMap<String, String> bfsExplanation = new LinkedHashMap<>();
        bfsExplanation.put("Best Case", "In the best case scenario, the starting vertex is the target vertex, and BFS terminates immediately after discovering the starting vertex.");
        bfsExplanation.put("Average Case", "In an average case scenario, where V is the number of vertices and E is the number of edges, BFS visits each vertex and edge once, resulting in a time complexity of O(V + E).");
        bfsExplanation.put("Worst Case", "In the worst case scenario, where V is the number of vertices and E is the number of edges, BFS visits each vertex and edge once, resulting in a time complexity of O(V + E).");
        bfsExplanation.put("Space Complexity", "The space complexity of BFS is dominated by the space required to store the visited array and the queue. The visited array requires O(V) space, and the queue may contain up to V vertices, resulting in a space complexity of O(V).");
        explanationMap.put("Breadth First Search (BFS)", bfsExplanation);

        LinkedHashMap<String, String> dfsExplanation = new LinkedHashMap<>();
        dfsExplanation.put("Best Case", "In the best case scenario, the starting vertex is the target vertex, and DFS terminates immediately after discovering the starting vertex.");
        dfsExplanation.put("Average Case", "In an average case scenario, where V is the number of vertices and E is the number of edges, DFS visits each vertex and edge once, resulting in a time complexity of O(V + E).");
        dfsExplanation.put("Worst Case", "In the worst case scenario, where V is the number of vertices and E is the number of edges, DFS visits each vertex and edge once, resulting in a time complexity of O(V + E).");
        dfsExplanation.put("Space Complexity", "The space complexity of DFS is dominated by the space required to store the visited array and the stack. The visited array requires O(V) space, and the stack may contain up to V vertices, resulting in a space complexity of O(V).");
        explanationMap.put("Depth First Search (DFS)", dfsExplanation);
    }
}
