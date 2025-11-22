package com.app.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.app.demo.model.Booking;
import com.app.demo.model.Catering;
import com.app.demo.model.User;
import com.app.demo.repository.BookingRepo;

@Service
public class BookingServices {
	
	@Autowired
	private BookingRepo bookingrepo;

	public BookingRepo getBookingrepo() {
		return bookingrepo;
	}

	public void setBookingrepo(BookingRepo bookingrepo) {
		this.bookingrepo = bookingrepo;
	}
	
	public void save(Booking booking) {
			
			System.out.println("saving...");
			bookingrepo.save(booking);
	}
	
	public Booking findById(int id) {
		return bookingrepo.findById(id).orElse(null);
		
	}
	

	public List<Booking> findAllandSortBy(){
		return bookingrepo.findAll();
	}


	public List<Booking> findAllByUser(User user) {
				return bookingrepo.findAllByUser(user);
	}
	
	
	public void bookingcancelByUser(int id) {
		bookingrepo.bookcancelByUser(id);
	}

	public void bookingPayment(int id) {
				bookingrepo.bookingPaymentCompleted(id);
	}

	public List<Booking> findAll() {
		return bookingrepo.findAll();
	}


	public void bookingcancelByAdmin(int booking_id) {
				bookingrepo.bookcancelByadmin(booking_id);
		
	}

	public void bookingacceptByAdmin(int booking_id) {
				bookingrepo.bookacceptByadmin(booking_id);
	}

	public long bookingcount() {
				return bookingrepo.count();
	}
	
	public long bookingcountPaid() {
		return bookingrepo.bookingcountPaid();
	}

	public long bookingcountunPaid() {
				return bookingrepo.bookingcountunPaid();
	}

	public long bookingcountByUser(User user) {
				return bookingrepo.bookingcountByUser(user);
	}

	public long bookingcountById(int id) {
				return bookingrepo.bookingcountById(id);
	}

	public long bookingcountPaidById(int id) {
				return bookingrepo.bookingcountPaidById(id);
	}

	public long bookingcountunPaidById(int id) {
				return bookingrepo.bookingcountunPaidById(id);
	}

	public long bookingcountcancelByAdmin() {
				return bookingrepo.bookingcountcancelByAdmin();
	}
	public long bookingcountcancelByUser() {
		return bookingrepo.bookingcountcancelByUser();
	}

	public long bookingcountcancelByAdminById(int id) {
				return bookingrepo.bookingcountcancelByAdminById(id);
	}

	public long bookingcountcancelByUserById(int id) {
				return bookingrepo.bookingcountcancelByUserById(id);
	}



	public long bookingpendingcount() {
				return bookingrepo.allBookingPendingCount();
	}

	public long bookingPendingcountById(int id) {
				return bookingrepo.bookingpendingcountById(id);
	}

	public List<Booking> findByHotelId(int id) {
				return bookingrepo.findHotelById(id);
	}

	public List<Booking> findByCateringId(int id) {
				return bookingrepo.findCateringById(id);
	}

	public List<Booking> findByPhotoNameId(String name_id) {
				return bookingrepo.findPhotoByNameId(name_id);
	}

	public List<Booking> findByDjNameId(String name_id) {
				return bookingrepo.findDjByNameId(name_id);
	}

	public List<Booking> findByMakeupNameId(String name_id) {
				return bookingrepo.findMakeupByNameId(name_id);
	}

	public List<Booking> findByDecoratorNameId(String name_id) {
				return bookingrepo.findDecoratorByNameId(name_id);
	}

	
	

}
