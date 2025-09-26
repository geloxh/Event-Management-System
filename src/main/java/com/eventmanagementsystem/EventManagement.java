package com.eventmanagementsystem;

import com.eventmanagement.models.Participant;
import com.eventmanagement.models.Event;
import com.eventmanagement.repositories.EventRepository;
import com.eventmanagement.repositories.ParticipantRepository;
import com.eventmanagement.repositories.impl.JdbcEventRepository;
import com.eventmanagement.repositories.impl.JdbcParticipantRepository;
import com.eventmanagement.ui.pages.AdminLoginPage;
import com.eventmanagement.ui.pages.EventDetailsPage;
import com.eventmanagement.ui.pages.HomePage;
import com.eventmanagement.ui.pages.StudentRegistrationPage;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

