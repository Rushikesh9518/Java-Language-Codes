package Java;

class ListNode1 {

	int data;
	ListNode1 next;

	ListNode1(int data){

		this.data = data;
		this.next = null;
	}
}

public class MergeSortedLists {

	public static ListNode1 mergeTwoLists(ListNode1 l1,ListNode1 l2) {

		ListNode1 dummy = new ListNode1 (0);
		ListNode1 current = dummy;

		while (l1 != null && l2 != null) {

			if (l1.data <= l2.data) {
				current.next = l1;
				l1 = l1.next;

			}else {
				current.next = l2;
				l2 = l2.next;
			}
			current = current.next;
		}
			if(l1 != null) {
				current.next = l1;

			}else if (l2 != null) {
				current.next = l2;
			}

			return dummy.next;

		}
	


	public static void printList(ListNode1 head) {

		ListNode1 current =head;
		while (current != null) {
			System.out.print(current.data + " -> ");
			current = current.next;
		}
		System.out.println("NULL");

	}


	public static void main(String [] args) {

		ListNode1 l1 = new ListNode1(1);
		l1.next = new ListNode1(3);
		l1.next.next = new ListNode1(5);

		ListNode1 l2 = new ListNode1(2);
		l2.next = new ListNode1(4);
		l2.next.next = new ListNode1(6);

		System.out.println("List 1:");
		printList(l1);

		System.out.println("List 2:");
		printList(l2);

		ListNode1 mergedList = mergeTwoLists(l1,l2);

		System.out.println("Merged List:");
		printList(mergedList);
	}
}


