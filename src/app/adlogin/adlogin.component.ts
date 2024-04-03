import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-adlogin',
  templateUrl: './adlogin.component.html',
  styleUrls: ['./adlogin.component.css']
})
export class AdloginComponent implements OnInit {
errorMessage: any;
loginForm: any;
loginData: any;

  constructor() { }

  ngOnInit(): void {
  }

}
