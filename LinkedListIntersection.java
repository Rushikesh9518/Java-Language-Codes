package Java;

class ListNode {

	int data;
	ListNode next;

	ListNode(int data) {

		this.data = data;
		this.next = null;
	}
}
public class LinkedListIntersection {

	public static ListNode getIntersectionNode(ListNode headA,ListNode headB){

		if (headA == null || headB == null)return null;

		ListNode pointerA = headA;
		ListNode pointerB = headB;

		while (pointerA != pointerB) {

			pointerA = (pointerA == null) ? headB : pointerA.next;
			pointerB = (pointerB == null) ? headA : pointerB.next;
		}		
		return pointerA;
	}

	public static void printList(ListNode head) {
		ListNode current = head;
		while (current != null) {

			System.out.println(current.data + "->");
			current = current.next;

		}

		System.out.println("NULL");
	}

	public static void main(String[] args) {

		ListNode headA = new ListNode (4);
		headA.next = new ListNode(1);
		ListNode intersect = new ListNode(8);
		intersect.next = new ListNode(4);
		intersect.next.next = new ListNode(5);

		ListNode headB = new ListNode(5);
		headB.next = new ListNode(6);
		headB.next.next = new ListNode(1);

		headA.next.next = intersect;
		headB.next.next.next = intersect;

		System.out.println("List A:");
		printList(headA);

		System.out.println("List B:");
		printList(headB);

		ListNode intersectionNode = getIntersectionNode(headA,headB);
		if(intersectionNode != null) {
			System.out.println("Intersection Node : " +intersectionNode.data);

		}else {

			System.out.println("No Intersection Node.");
		}
	}
}
