import {customElement, FASTElement, observable} from '@microsoft/fast-element';
import {EntityManagement} from '@genesislcap/foundation-entity-management';
import { HomeTemplate as template } from './home.template';
import { HomeStyles as styles } from './home.styles';

EntityManagement;

const name = 'home-route';

const defaultColumnConfig = {
  enableCellChangeFlash: true,
  enableRowGroup: true,
  enablePivot: true,
  enableValue: true,
};

const COLUMNS = [
  {
    ...defaultColumnConfig,
    field: 'TRADE_ID',
    headerName: 'Id',
  },
  {
    ...defaultColumnConfig,
    field: 'QUANTITY',
    headerName: 'Quantity',
  },
  {
    ...defaultColumnConfig,
    field: 'PRICE',
    headerName: 'Price',
  },
  {
    ...defaultColumnConfig,
    field: 'SYMBOL',
    headerName: 'Symbol',
  },
  {
    ...defaultColumnConfig,
    field: 'DIRECTION',
    headerName: 'Direction',
  },
];

@customElement({
  name,
  template,
  styles,
})
export class Home extends FASTElement {
@observable columns: any = COLUMNS;
  constructor() {
    super();
  }
}
