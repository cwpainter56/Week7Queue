import java.util.Scanner;

class CharNode {

	char ch;

	CharNode next;

	public CharNode(char ch, CharNode node)

	{

		this.ch = ch;

		this.next = node;

	}

}

class Queue

{

	private CharNode head;

	private CharNode tail;

	private int size;

	public void enqueue(char ch)

	{

		if (size == 10)

		{

			System.out.println("Error! already 10 elements are present in the queue!.");

			return;

		}

		if (head == null)

		{

			head = new CharNode(ch, null);

			tail = head;

		}

		else {

			tail.next = new CharNode(ch, null);

			tail = tail.next;

		}

		size++;

	}

	public char dequeue() throws Exception

	{

		if (size == 0)

			throw new Exception("Queue Underflow!");

		CharNode node = head;

		head = head.next;

		size--;

		return node.ch;

	}

	public void printQueue()

	{

		CharNode temp = head;

		while (temp != null)

		{

			System.out.print(temp.ch + " ");

			temp = temp.next;

		}

		System.out.println();

	}

}

public class CharQueue {

	public static void main(String[] args) throws Exception {
		Scanner q = new Scanner(System.in);

		String tempChar = null;
		String select = null;

		char tempch, selection;

		Queue q1 = new Queue();

		q1.enqueue('a');

		q1.enqueue('b');

		q1.enqueue('c');

		q1.enqueue('d');

		q1.enqueue('e');

		q1.enqueue('f');

		q1.enqueue('g');

		q1.enqueue('h');

		q1.enqueue('i');
		
		q1.enqueue('j');

		System.out.println("The queue is: ");

		q1.printQueue();

		do {

			System.out.println("Would you like to: \n(E)nqueue, (D)equeue, or (P)rint the queue, or (T)erminate?");

			select = q.next();
			selection = select.charAt(0);

			switch (selection) {

			case 'E':

				System.out.println("Enter the character you would like to add to the queue:");

				tempChar = q.next();
				tempch = tempChar.charAt(0);
				q1.enqueue(tempch);
				break;

			case 'D':

				q1.dequeue();
				break;

			case 'P':

				q1.printQueue();
				break;

			case 'T':

				q.close();
				System.exit(0);
				break;
			}
		} while (selection != 'T');

	}
}