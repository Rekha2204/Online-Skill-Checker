import { ComponentFixture, TestBed } from '@angular/core/testing';

import { StudregComponent } from './studreg.component';

describe('StudregComponent', () => {
  let component: StudregComponent;
  let fixture: ComponentFixture<StudregComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ StudregComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(StudregComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
