I use observer-pattern and CRC-pattern for this project. I make customer as a subject and I make Collaborationclass as a observer.
I also make collaboration class communicate with waitlist-class and table-class to make sure every customer can add to the waitlist or have a seat
Why I only made customer as a subject? instead of making waitlist and table all of them as a subject？ Because I got the idea from the real life.
when we go to restaurant in real-life, there is always a waitress or restaurant owner come to you and say hello and ask "how many? ", and 
I think this waiter or servant is just collaboration-class, he or she monitoer if there are some customers who are going to have a meal.
and I didn't make waitlist and table as a being observed class, because I think it's a waiter's job to know and help arrange customer, just like
when we finish dinner and be ready to check, then waiter should clean table and arrange next customer.
