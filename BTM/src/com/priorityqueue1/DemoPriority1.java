package com.priorityqueue1;

import java.util.PriorityQueue;
import java.util.TreeSet;

public class DemoPriority1 {
				public static void main(String[] args)
				{
					Laptop l1=new Laptop(14,8.3,"abc");
					Laptop l2=new Laptop(52,125.366,"try");
					Laptop l3=new Laptop(85,8.2,"java");
					Laptop l4=new Laptop(5,8563.2,"sql");
					Laptop l5=new Laptop(28,13.5,"testing");

					PriorityQueue pq=new PriorityQueue();
					pq.add(l1);
					pq.add(l2);
					pq.add(l3);
					pq.add(l4);
					pq.add(l5);
					System.out.println("first treeset output");

					for(Object ob:pq)
					{
						System.out.println(ob);
					}
					PriorityQueue pq2=new PriorityQueue(new SortBaseOnRam());
					pq2.add(l1);
					pq2.add(l2);
					pq2.add(l3);
					pq2.add(l4);
					pq2.add(l5);
					System.out.println("second treeset output");

					for(Object ob:pq2)
					{
						System.out.println(ob);
					}
					PriorityQueue pq3=new PriorityQueue(new SortBaseOnVersion());
					pq3.add(l1);
					pq3.add(l2);
					pq3.add(l3);
					pq3.add(l4);
					pq3.add(l5);
					System.out.println("third treeset output");
					for(Object ob:pq3)
					{
						System.out.println(ob);
					}

				}

	}
