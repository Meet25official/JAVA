/*
-> Scenario: Restaurant Kitchen Order Processing

Context:
A restaurant has multiple kitchen staff working on preparing meals. Each staff member (chef, sous-chef, etc.) performs different tasks such as chopping vegetables, cooking meat, or plating dishes.

Threads in the System:
1. Order Processing Thread: Receives and processes orders from customers.
2. Preparation Threads: Each handles specific tasks like chopping, cooking, or plating.

Inter-Thread Communication:

1. Order Processing:
   - Role: When a new order is received, this thread creates a task for each item in the order. For instance, if the order is for a steak and salad, it will create two tasks: one for cooking the steak and another for preparing the salad.
   - Communication: This thread communicates with the preparation threads by sending them tasks. For example, it might use a shared queue where it places tasks that need to be executed.

2. Preparation Threads:
   - Role: Each preparation thread listens for new tasks in the shared queue. Once a task is received (e.g., "chop vegetables" or "grill steak"), the thread performs the task and then informs the order processing thread about the progress or completion.
   - Communication: After completing a task, the preparation thread might update a shared status report or queue. For example, once the steak is cooked, it might move the task from the "in-progress" queue to the "completed" queue, signaling that the steak is ready for plating.

3. Order Completion:
   - Role: After all tasks for a given order are completed, the order processing thread needs to assemble the final meal and send it to the serving staff.
   - Communication: The order processing thread monitors the status updates from the preparation threads. Once all tasks are marked as completed, it assembles the meal and sends it out.

-> Summary
In this restaurant kitchen scenario, inter-thread communication involves tasks being sent from the order processing thread to various preparation threads and updates being sent back to indicate progress. This coordination ensures that each order is completed efficiently and in the correct order.
*/
public class InterThreadComm {
    public static void main(String[] args) {
        
    }   
}
